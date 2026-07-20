class Solution {
   public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] counter = new int[26]; // Массив-счетчик для 'a'-'z'

    for (int i = 0; i < s.length(); i++) {
        counter[s.charAt(i) - 'a']++; // Инкремент для символа из s
        counter[t.charAt(i) - 'a']--; // Декремент для символа из t
    }

    for (int count : counter) {
        if (count != 0) return false; // Если где-то не ноль — буквы не совпали
    }
    return true;
}
}
