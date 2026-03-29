class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        if (set.size() < nums.length) {
            return true;
        }
        return false;
    }
}