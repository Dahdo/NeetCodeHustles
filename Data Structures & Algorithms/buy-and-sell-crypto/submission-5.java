class Solution {
    public int maxProfit(int[] prices) {
        int b = 0;
        int s = 1;
        int maxProfit = 0;

        while (s < prices.length) {
            
            if (prices[s] > prices[b]) {
                int profit = prices[s] - prices[b];
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                b = s;
            }
            s++;
        }

        return maxProfit;
    }
}
