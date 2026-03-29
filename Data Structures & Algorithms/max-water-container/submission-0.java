class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int l = 0;
        int r = heights.length - 1;
        while (l < r) {
            int currentWater = (r - l) * Math.min(heights[l], heights[r]);
            if (currentWater > maxWater) {
                maxWater = currentWater;
            }
            if (heights[l] < heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }

        return maxWater;
    }
}
