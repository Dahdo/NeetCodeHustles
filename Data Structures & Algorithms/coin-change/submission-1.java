class Solution {
    Map<Integer, Integer> memo = new HashMap<>();
    public int dfs(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        int result = Integer.MAX_VALUE;

        for (int coin : coins) {
            if (amount - coin >= 0) {

                int tmpResult = dfs(coins, amount - coin);
                if (tmpResult != Integer. MAX_VALUE) {
                    result = Math.min(result, 1 + tmpResult);
                }
            }
        }
        memo.put(amount, result);
        return result;
    }

    public int coinChange(int[] coins, int amount) {
        int coinCount = dfs(coins, amount);

        return coinCount >= Integer.MAX_VALUE ? -1 : coinCount;
    }
}
