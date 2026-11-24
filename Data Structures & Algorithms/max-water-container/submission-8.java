class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int currWater = Math.min(heights[l], heights[r]) * (r - l);
            if (heights[l] <= heights[r]) {
                l++;
            }
            else {
                r--;
            }
            maxWater = Math.max(maxWater, currWater);
        }

        return maxWater;
    }
}
