class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int n : nums) {
            numCountMap.put(n, numCountMap.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            minHeap.add(new int[]{entry.getKey(), entry.getValue()});

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        int i = 0;
        for (int[] pair : minHeap) {
            result[i++] = pair[0];
        }

        return result;

    }
}
