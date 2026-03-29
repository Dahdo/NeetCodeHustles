class Solution {
    public int characterReplacement(String s, int k) {

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> countMap = new HashMap<>();
            int maxChar = 0;
            for (int j = i; j < s.length(); j++) {
                countMap.put(s.charAt(j), countMap.getOrDefault(s.charAt(j), 0) + 1);
                maxChar = Math.max(maxChar, countMap.get(s.charAt(j)));

                if ((j - i + 1) - maxChar <= k) {
                    result = Math.max(result, (j - i + 1));
                }
            }
        }

        return result;
    }
}
