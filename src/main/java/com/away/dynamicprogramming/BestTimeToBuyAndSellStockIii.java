package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-17 9:56
 */
public class BestTimeToBuyAndSellStockIii {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][3][2];
        dp[0][1][0] = 0;
        dp[0][1][1] = -prices[0];
        dp[0][2][0] = 0;
        dp[0][2][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][1][0] = Math.max(dp[i - 1][1][0], dp[i - 1][1][1] + prices[i]);
            dp[i][1][1] = Math.max(dp[i-1][1][1], dp[i][0][0] - prices[i]);
            dp[i][2][0] = Math.max(dp[i - 1][2][0], dp[i - 1][2][1] + prices[i]);
            dp[i][2][1] = Math.max(dp[i - 1][2][1], dp[i - 1][1][0] - prices[i]);
        }
        return dp[prices.length-1][2][0];
    }

    /**
     * 优化空间
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        int len = prices.length;
        int firstHold = -prices[0];
        int firstSell = 0;
        int secondHold = -prices[0];
        int secondSell = 0;

        for (int i = 1; i < len; i++) {
            secondSell = Math.max(secondSell, secondHold + prices[i]);
            secondHold = Math.max(secondHold, firstSell - prices[i]);
            firstSell = Math.max(firstSell, firstHold + prices[i]);
            firstHold = Math.max(firstHold,-prices[i]);

        }
        return secondSell;
    }
}
