class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] nums2D = new int[nums.length][2];

        for (int i = 0; i < nums.length; i ++) {
            nums2D[i][0] = i;
            nums2D[i][1] = nums[i];
        }

        Arrays.sort(nums2D, Comparator.comparingInt(a -> a[1]));

        int i = 0; 
        int j = nums.length - 1;

        while (i < j) {
            int curr = nums2D[i][1] + nums2D[j][1];

            if (curr == target) {
                return new int [] {
                    Math.min(nums2D[i][0], nums2D[j][0]),
                    Math.max(nums2D[i][0], nums2D[j][0])
                };
            }

            else if (curr < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[0];

    }
}
