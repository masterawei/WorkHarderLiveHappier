package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-14 10:18
 */
public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0]= 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }
        return dp[amount];
    }
}
