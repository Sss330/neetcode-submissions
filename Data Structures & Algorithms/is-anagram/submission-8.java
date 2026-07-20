class Solution {
    public boolean isAnagram(String s, String t) {
        s.toLowerCase();
        t.toLowerCase();

        if (s.length() != t.length()){
            return false;
        }

        int[] alfavit = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alfavit[s.charAt(i) - 'a']++;
            alfavit[t.charAt(i) - 'a']--;
        }

        for (int i : alfavit){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
