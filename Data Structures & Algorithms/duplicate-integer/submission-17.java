class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) 
                return true;
        }

        return false;
    }
}