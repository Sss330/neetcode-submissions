class Solution {
  public static boolean hasDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(); // Один сет на весь метод
    for (int n : nums) {
        // add() вернет false, если число уже есть в сете
        if (!set.add(n)) { 
            return true; 
        }
    }
    return false;
}
}