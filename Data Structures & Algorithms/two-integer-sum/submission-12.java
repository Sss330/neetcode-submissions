class Solution {
   public int[] twoSum(int[] nums, int target) {
        // Ключ — само число, Значение — его исходный индекс в массиве
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Если мы уже видели нужное число раньше
            if (map.containsKey(complement)) {
                // Возвращаем старый индекс и текущий индекс
                return new int[] { map.get(complement), i };
            }
            
            // Если не видели, сохраняем текущее число и его индекс
            map.put(nums[i], i);
        }
        
        return null;
    }
}
