class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int current = nums[0];
        int count = 1;
        List<Integer> countList = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == current + 1) {
                count++;
                current = nums[i];
            }
            if (nums[i] > current + 1) {
                countList.add(count);
                current = nums[i];
                count = 1;
            }
        }

        int countL = countList.size() > 0 ? Collections.max(countList) : 0;

        return count > countL ? count : countL;

    }

}
