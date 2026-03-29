class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return binarySearch(piles, h);
    }

    public int binarySearch(int[] piles, int h) {
        int maxPileCount = Arrays.stream(piles).max().getAsInt();

        int left = 1;
        int right = maxPileCount;
        int result = left;

        while (left <= right) {
            int midK = left + (right - left) / 2;

            int totalTime = 0;
            for (int pile : piles) {
                totalTime += Math.ceil((double) pile / midK);
            }

            if(totalTime <= h) {
                result = midK;
                right = midK - 1;
            }
            else {
                left = midK + 1;
            }
        }
        return result;
    }
}
