class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()){
            return false;
        }
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");

        char[] sChar = s.toCharArray();

        int left = 0;
        int right = sChar.length - 1;

        
        while (left < right) {
            if(sChar[left] != sChar[right]){
                 return false;
              
            }   
            left++;
            right--;
    
        }
    return true;
    }
}
