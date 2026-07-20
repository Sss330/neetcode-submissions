class Solution {
public static boolean hasDuplicate(int[] nums) {
    Arrays.sort(nums); // Теперь массив [1, 1, 2, 3...]
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == nums[i + 1]) {
            return true;
        }
    }
    return false;
}
}