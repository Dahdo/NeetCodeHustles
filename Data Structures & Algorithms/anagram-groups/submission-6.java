class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagMap = new HashMap<>();

        for (String str : strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);

            anagMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagMap.values());
    }
}
