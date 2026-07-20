class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int rigth = ss.length() -1;

        while(left < rigth){
            if(ss.charAt(left) != ss.charAt(rigth)){
                return false;
            }
            left++;
            rigth--;
        }
    return true;
    }
}
