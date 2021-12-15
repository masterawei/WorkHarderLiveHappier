package com.away.dynamicprogramming;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-15 10:00
 *
 */
public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < len; i++) {
            int coin = coins[i];
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j - coin]+1,dp[j]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
