class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //     if (s.length() == 0)
    //         return 0;

    //     Set<Character> countSet = new HashSet<>();
    //     int l = 0;
    //     int r = 0;
    //     countSet.add(s.charAt(r));
    //     int maxLen = countSet.size(); // r - l + 1

    //     for (++r; r < s.length(); r++) {
    //         char c = s.charAt(r);
    //         while (countSet.contains(c)) {
    //             char lChar = s.charAt(l);
    //             countSet.remove(lChar);
    //             l++;
    //         }
    //         countSet.add(c);
    //         maxLen = Math.max(maxLen, countSet.size());
    //     }

    //     return maxLen;

    // }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        Set<Character> charSet = new HashSet<>();

        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }

            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
