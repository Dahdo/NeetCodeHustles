class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // The goal: finding min k
        // the upper-bound of k is the tallest pile and min let's assume 1 cz we have to be eating sth
        // we are basically optimizing for the min value and the condition of reference is that totalH <= h
        // we will use binary search optimizing towards the left

        int tallestPileCount = Arrays.stream(piles).max().getAsInt();

        int l = 1;
        int r = tallestPileCount;
        int minK = l;

        while (l <= r) {
            int midK = l + (r - l) / 2;
            int totalHrs = 0;

            for (int pileCount : piles) {
                totalHrs += Math.ceil( (double)pileCount / midK );
            }

            if (totalHrs <= h) {
                minK = midK;
                r = midK - 1;
            }
            else {
                l = midK + 1;
            }
        }

        return minK;
    }
}
