class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // int[] pref = new int[n];
        int[] suff = new int[n];
        int[] res = new int[n];

        // pref[0] = 1;
        res[0] = 1;
        suff[n - 1] = 1;


        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;
    }
}  
