class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> cache = new HashMap<>(); // num -> index
        Set<List<Integer>> unique = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            cache.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int rhs = -(nums[i] + nums[j]);

                if (cache.containsKey(rhs) && 
                cache.get(rhs) != i && cache.get(rhs) != j) {
                    List<Integer> currTripple = Arrays.asList(nums[i], nums[j], nums[cache.get(rhs)]);
                    Collections.sort(currTripple);
                    unique.add(currTripple);
                }
            }
        }

        return new ArrayList<>(unique);
    }
}
