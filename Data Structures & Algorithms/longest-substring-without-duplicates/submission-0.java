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
                countSet.add(s.charAt(i));
            }

            int currLen = right - left + 1;
            
            if (countSet.size() < currLen) {
                left++;
            }
            else {
                if( currLen > maxLen) {
                    maxLen = currLen;
                }
                right++;
            }
        }

        return maxLen;
    }
}
