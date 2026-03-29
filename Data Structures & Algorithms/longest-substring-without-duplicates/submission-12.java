class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        Set<Character> countSet = new HashSet<>();
        int l = 0;
        int r = 0;
        countSet.add(s.charAt(r));
        int maxLen = countSet.size(); // r - l + 1

        for (++r; r < s.length(); r++) {
            char c = s.charAt(r);
            while (countSet.contains(c)) {
                char lChar = s.charAt(l);
                countSet.remove(lChar);
                l++;
            }
            countSet.add(c);
            maxLen = Math.max(maxLen, countSet.size());
        }

        return maxLen;

    }
}
