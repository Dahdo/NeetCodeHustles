class Solution {
    public int[] productExceptSelf(int[] nums) {
    //     int prod = 1, zeroCount = 0;
    //     int[] res = new int[nums.length];

    //     for (int num : nums) {
    //         if (num == 0)
    //             zeroCount++;
    //         else 
    //             prod *= num;

    //         if (zeroCount > 1) 
    //             return res;
    //     }

        
    //     for (int i = 0; i < nums.length; i++) {
    //         if (zeroCount == 1) 
    //             res[i] = (nums[i] == 0) ? prod : 0;
    //         else
    //             res[i] = prod / nums[i];
    //     }

    //     return res;

    // =============================

        // int n = nums.length;
        // int[] res = new int[n];
        // int[] pref = new int[n];
        // int[] suff = new int[n];

        // pref[0] = suff[n - 1] = 1;

        // for (int i = 1; i < n; i++) {
        //     pref[i] = pref[i - 1] * nums[i - 1];
        // }
        // for (int i = n - 2; i >= 0; i--) {
        //     suff[i] = suff[i + 1] * nums[i + 1];
        // }

        // for (int i = 0; i < n; i++) {
        //     res[i] = pref[i] * suff[i];
        // }

        // return res;


        // ===========================================

        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suff = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suff;
            suff *= nums[i];
        }

        return res;
    }
}  
