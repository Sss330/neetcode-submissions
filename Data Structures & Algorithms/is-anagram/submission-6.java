class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] asd = new int[26];

        for(int i = 0; i < s.length(); i++){
            asd[s.charAt(i) - 'a']++;
        }

      
        for(int i = 0; i < t.length(); i++){
            asd[t.charAt(i) - 'a']--;
        }


    for(int c : asd){
        if(c != 0){
            return false;
        }
    }
        return true;
    }
}
