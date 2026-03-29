class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // array value -> array index

        int i = 0;
        for (int num : numbers) {
            numMap.put(num, i++);
        }

        for (int j = 0; j < numbers.length; j++) {
            int num2 = target - numbers[j];

            if (numMap.containsKey(num2) && numMap.get(num2) != j) {
                return new int[] {j + 1, numMap.get(num2) + 1};
            }
        }

        return new int[0];
    }
}
