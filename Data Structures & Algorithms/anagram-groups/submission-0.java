class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sSorted = new String(sArray);

            map.putIfAbsent(sSorted, new ArrayList<String>());
            map.get(sSorted).add(s);
        }

        return new ArrayList<>(map.values());
    }

    
}
