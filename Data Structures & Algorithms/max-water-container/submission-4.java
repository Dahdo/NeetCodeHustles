class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int currArea = Math.min(heights[l], heights[r]) * (r - l);
            result = Math.max(result, currArea);

            if (heights[l] < heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }

        return result;
    }
}
