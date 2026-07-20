class Solution {
    public int[] twoSum(int[] nums, int target) {
        int secondPointer = 0;
        //int result = target -
for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] + nums[i] == target) {
            return new int[]{i,j};
        }
    }
}


        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] + nums[secondPointer] < target) {
        //           secondPointer++;  
        //     } else {
        //         i--;
        //     }
        //     if (nums[i] + nums[secondPointer] == target){
        //         return new int[]{i,secondPointer};
        //     }
        // }
        return null;
    }
}
