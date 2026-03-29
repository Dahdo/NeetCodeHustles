class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagMap = new HashMap<>();

        for (String str : strs) {
            char[] strArr = str.toCharArray();
            char[] counts = new char[26]; // should be char[] in order to work with String.valueOf(char[] data) function
            for (char c : strArr) {
                counts[c - 'a']++;
            }
            String countsKey = String.valueOf(counts);
            anagMap.putIfAbsent(countsKey, new ArrayList<>());
            anagMap.get(countsKey).add(str);
        }

        return new ArrayList<>(anagMap.values());
    }
}
