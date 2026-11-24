class Solution {
    public int longestConsecutive(int[] nums) {
  
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int result = 0;

        for (int num : nums) {
            if(!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                result = Math.max(length, result);
            }
        }

        return result;
    }
}


// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if (nums.length == 0)
//             return 0;

//         Arrays.sort(nums);
//         int res = 0, curr = nums[0], streak = 0, i = 0;

//         while(i < nums.length) {
//             if (nums[i] != curr) {
//                 streak = 0;
//                 curr = nums[i];
//             }
//             while (i < nums.length && curr == nums[i])
//                 i++;

//             streak++;
//             curr++;
//             res = Math.max(res, streak);

//         }

//         return res;
//     }
// }
