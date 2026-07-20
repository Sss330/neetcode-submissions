class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k]; 

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

      for (Map.Entry n : map.entrySet()) {
            
        }

        List<Map.Entry<Integer,Integer>> dsa = new ArrayList<>(map.entrySet());

        dsa.sort((a, b) -> b.getValue() - a.getValue());

        for(int i = 0; i < k; i++) {
            result[i] = dsa.get(i).getKey();
        }

    return result;
    }
}