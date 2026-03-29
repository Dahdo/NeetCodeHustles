class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();


        for (String str : strs) {
            int[] count = new int[26];

            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            String ourCodedKey = Arrays.toString(count);
            map.putIfAbsent(ourCodedKey, new ArrayList<>());
            map.get(ourCodedKey).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
