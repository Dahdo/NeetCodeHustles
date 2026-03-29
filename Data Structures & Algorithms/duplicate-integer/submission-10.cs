public class Solution {
    public bool hasDuplicate(int[] nums) {
        int[] prevNums = new int[nums.Length]; 
        int counter = 0;

        for (int i = 0; i < nums.Length; i++) {

            for (int j = 0; j < counter; j++) {
                    if (nums[i] == prevNums[j]) {
                    return true;
                }
            }
            
            prevNums[i] = nums[i];
            counter++;
        }
        return false;
    }
}