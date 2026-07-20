class Solution {
      public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (var a : strs) {
            char[] word = a.toCharArray();
            Arrays.sort(word);

            if (!map.containsKey(Arrays.toString(word))) {
                map.put(Arrays.toString(word), new ArrayList<>());
                map.get(Arrays.toString(word)).add(a);
            } else {
                map.get(Arrays.toString(word)).add(a);
            }
        }

        return new ArrayList<>(map.values());

    }
}
