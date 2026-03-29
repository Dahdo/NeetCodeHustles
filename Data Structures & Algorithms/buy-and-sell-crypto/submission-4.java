class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int b = 0;

        for (int s = 1; s < prices.length; s++) {
            if (prices[b] < prices[s]) {
                maxProfit = Math.max(maxProfit, prices[s] - prices[b]);
            }
            else {
                b = s;
            }
        }

        return maxProfit;
    }

}
