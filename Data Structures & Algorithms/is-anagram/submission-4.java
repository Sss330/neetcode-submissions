class Solution {
   public static boolean isAnagram(String s, String t) {

    if(s.length() != t.length()){
        return false;
    }
  int[] alf = new int[26];

  for (int i = 0; i < t.length(); i++) {
    alf[s.charAt(i) - 'a']++;
    alf[t.charAt(i) - 'a']--;
  }
 for (int count : alf) {
        if (count != 0) return false; // Если где-то не ноль — буквы не совпали
    }
    return true;
}
}