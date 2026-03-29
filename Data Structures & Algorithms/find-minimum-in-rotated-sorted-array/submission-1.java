class Solution {
    public int findMin(int[] nums) {
        // int min = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     min = Math.min(min, nums[i]);
        // }

        // return min;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : nums) {
            minHeap.offer(n);
        }

        return minHeap.poll();
    }
}
