package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-17 10:47
 */
public class BestTimeToBuyAndSellStockIv {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k == 0) {
            return 0;
        }
        int length = prices.length;
        int[][][] dp = new int[length][k + 1][2];
        for (int i = 1; i <= k; i++) {
            dp[0][i][1] = -prices[0];
        }
        for (int i = 1; i < length; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j ][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[length - 1][k][0];
    }
    /**
     * 优化空间
     */

    public int maxProfit2(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k == 0 ) {
            return 0;
        }
        //用0代表sell,1代表hold
        int[][] sellAndHold = new int[k + 1][2];
        for (int i = 1; i <= k; i++) {
            sellAndHold[i][1] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = k; j > 0; j--) {
                sellAndHold[j][0] = Math.max(sellAndHold[j][0], sellAndHold[j][1] + prices[i]);
                sellAndHold[j][1] = Math.max(sellAndHold[j][1], sellAndHold[j - 1][0] - prices[i]);
            }
        }
        return sellAndHold[k][0];

    }
}
