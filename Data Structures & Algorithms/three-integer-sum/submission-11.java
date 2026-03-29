class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        // Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> subResult = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(subResult);
                        set.add(subResult);
                    }
                }
            }
        }

        // for(int i = 0; i < nums.length; i++) {
        //     if (nums[i] > 0) {
        //         break;
        //     }
        //     if (i > 0 && nums[i] == nums[i - 1]) {
        //         continue;
        //     }
        //     int k = i + 1;
        //     int s = nums.length - 1;
            
        //     int target = -nums[i];

        //     while (k < s) {
        //         int sum = nums[k] + nums[s];
        //         if (sum < target) {
        //             k++;
        //         }
        //         else if (sum > target) {
        //             s--;
        //         }
        //         else {
        //             result.add(Arrays.asList(nums[i], nums[k], nums[s]));
        //             k++;
        //             while(k < s && nums[k] == nums[k - 1]) {
        //             k++;
        //             }
        //             s--;
        //             while(k < s && nums[s] == nums[s + 1]) {
        //             s--;
        //             }
        //         }
        //     }
        // }

       return new ArrayList(set); 
    }
}
