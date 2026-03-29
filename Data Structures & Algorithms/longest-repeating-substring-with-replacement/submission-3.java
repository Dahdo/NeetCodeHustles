class Solution {
    public int characterReplacement(String s, int k) {

        int result = 0;
        int l = 0;
        int maxChar = 0;
        Map<Character, Integer> countMap = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            countMap.put(s.charAt(r), countMap.getOrDefault(s.charAt(r), 0) + 1);
            maxChar = Math.max(maxChar, countMap.get(s.charAt(r)));
            if ((r - l + 1) - maxChar > k) {
                countMap.put(s.charAt(l), countMap.get(s.charAt(l)) - 1);
                l++;
            }
            result = Math.max(result, (r - l + 1));
        }

        return result;
        // for (int i = 0; i < s.length(); i++) {
        //     Map<Character, Integer> countMap = new HashMap<>();
        //     int maxChar = 0;
        //     for (int j = i; j < s.length(); j++) {
        //         countMap.put(s.charAt(j), countMap.getOrDefault(s.charAt(j), 0) + 1);
        //         maxChar = Math.max(maxChar, countMap.get(s.charAt(j)));

        //         if ((j - i + 1) - maxChar <= k) {
        //             result = Math.max(result, (j - i + 1));
        //         }
        //     }
        // }

        // return result;
    }
}
