class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);              // шаг 1: сортируем
            String key = new String(chars);  // шаг 2: делаем ключ

            map.computeIfAbsent(key, k -> new ArrayList<>())
               .add(s);                      // шаг 3: кладём в группу
        }

        return new ArrayList<>(map.values());
    }
}
