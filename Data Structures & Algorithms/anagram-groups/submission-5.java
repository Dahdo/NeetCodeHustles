class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            // char[] charArray = str.toCharArray();
            // Arrays.sort(charArray);
            // String sortedStr = new String(charArray);

            int[] charCount = new int[26];
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }
            String strCount = Arrays.toString(charCount);
            
            anagramMap.putIfAbsent(strCount, new ArrayList<>());
            anagramMap.get(strCount).add(str);

            // anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            // anagramMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramMap.values());

    }
}
