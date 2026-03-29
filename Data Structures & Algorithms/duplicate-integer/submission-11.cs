public class Solution {
    public bool hasDuplicate(int[] nums) {
        Array.Sort(nums);
        int prev = int.MinValue; 
        for (int i = 0; i < nums.Length; i++) {
           if (nums[i] == prev) {
                    return true;
            }
            prev = nums[i];
        }
        return false;
    }
}