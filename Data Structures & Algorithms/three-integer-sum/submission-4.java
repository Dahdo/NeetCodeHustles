class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = i + 1;
            int s = nums.length - 1;
            
            int target = -nums[i];

            while (k < s) {
                int sum = nums[k] + nums[s];
                if (sum < target) {
                    k++;
                }
                else if (sum > target) {
                    s--;
                }
                else {
                    result.add(Arrays.asList(nums[i], nums[k], nums[s]));
                    k++;
                    while(k < s && nums[k] == nums[k - 1]) {
                        k++;
                        s--;
                    }
                }
            }
        }

       return result; 
    }
}
