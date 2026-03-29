class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, zeroCount = 0;
        int[] res = new int[nums.length];

        for (int num : nums) {
            if (num == 0)
                zeroCount++;
            else 
                prod *= num;

            if (zeroCount > 1) 
                return res;
        }

        
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 1) 
                res[i] = (nums[i] == 0) ? prod : 0;
            else
                res[i] = prod / nums[i];
        }

        return res;
    }
}  
