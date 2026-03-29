class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1)
            return s.length();

        int maxLen = 1;
        int left = 0;
        int right = 0;

        while (right < s.length() && left <= right) {
            Set<Character> countSet = new HashSet<>();
            for (int i = left; i <= right; i++) {
                if (countSet.contains(s.charAt(i))) {
                    left++;
                    break;
                }
                countSet.add(s.charAt(i));
            }

            maxLen = Math.max(maxLen, countSet.size());
                right++;
        }

        return maxLen;
    }
}
