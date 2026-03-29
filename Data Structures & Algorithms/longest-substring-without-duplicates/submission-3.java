class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1)
            return s.length();

        int maxLen = 1;
        int left = 0;
        int right = 0;
        Set<Character> countSet = new HashSet<>();

        while (right < s.length() && left <= right) {
            while (countSet.contains(s.charAt(right))) {
                countSet.remove(s.charAt(left));
                left++;
            }

            countSet.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
