package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-18 13:30
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        dp[0][1] = -prices[0] - fee;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i] - fee);
        }
        return dp[prices.length-1][0];
    }

    /**
     * 优化了空间复杂度
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit2(int[] prices, int fee) {
        int hold = -prices[0]-fee;
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            hold = Math.max(hold, sell - prices[i] - fee);
            sell = Math.max(sell, hold + prices[i]);
        }
        return sell;
    }
}
