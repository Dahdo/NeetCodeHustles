class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();

        int maxLen = 1;
        int left = 0;
        Set<Character> countSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (countSet.contains(s.charAt(right))) {
                countSet.remove(s.charAt(left));
                left++;
            }

            countSet.add(s.charAt(right));
            maxLen = Math.max(maxLen, countSet.size());
        }

        return maxLen;
    }
}
