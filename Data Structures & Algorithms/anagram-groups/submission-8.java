class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            char[] charStr = str.toCharArray();
            char[] charCount = new char[26];

            for (char c : charStr) {
                charCount[c - 'a']++;
            }
            String key = Arrays.toString(charCount);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
        }

        return new ArrayList<>(result.values());
    }
}
