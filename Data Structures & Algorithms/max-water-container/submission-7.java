class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int currWater = Math.min(heights[l], heights[r]) * (r - l);
            if (heights[r] <= heights[l]) {
                r--;
            }
            else {
                l++;
            }
            maxWater = Math.max(maxWater, currWater);
        }

        return maxWater;
    }
}
