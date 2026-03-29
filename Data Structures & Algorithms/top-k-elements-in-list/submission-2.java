class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            minHeap.add(new int[]{entry.getKey(), entry.getValue()});

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int [] result = new int[k];
        for(int i = 0; i < result.length; i++) {
            result[i] = minHeap.poll()[0];
        }

        return result;

    }
}
