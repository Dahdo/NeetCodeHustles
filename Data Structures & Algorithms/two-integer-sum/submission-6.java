class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>(); // array value -> array index

        int i = 0;
        for (int num : nums) {
            numMap.put(num, i++);
        }

        for (int j = 0; j < nums.length; j++) {
            int num2 = target - nums[j];

            if (numMap.containsKey(num2) && numMap.get(num2) != j) {
                return new int[] {j, numMap.get(num2)};
            }
        }

        return new int[0];

    }
}
