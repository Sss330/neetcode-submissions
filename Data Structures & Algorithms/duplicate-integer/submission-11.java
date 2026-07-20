class Solution {
      public boolean hasDuplicate(int[] nums) {

        Map<Integer, Integer> numberToDuplicateCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            numberToDuplicateCount.put(nums[i], numberToDuplicateCount.getOrDefault(nums[i], 0) + 1);
        }

        for (var num:numberToDuplicateCount.values()){
            if (num > 1) {
                return true;
            }
        }
        return false;
    }
}