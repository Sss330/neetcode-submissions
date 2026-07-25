class Solution {
    public boolean isValid(String s) {
        Deque<Character> result = new ArrayDeque<>(); 

        if (s.length() <2){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
    
            if (a == '(' || a == '[' || a == '{') {
                result.push(a);
            } else {
                if (result.isEmpty()){
                    return false;                
                }

                char q = result.pop();
                if (q == '[' && a != ']' || q == '{' && a != '}' || q == '(' && a != ')') {
                    return false;
                }
            }
           
        }

        return result.isEmpty();
        
    }
}
