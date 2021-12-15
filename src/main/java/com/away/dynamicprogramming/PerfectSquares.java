package com.away.dynamicprogramming;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-15 10:33
 */
public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i * i; j++) {
                if (i > j * j) {
                    dp[i] = Math.min(dp[i],dp[i-j*j]+1);
                }
            }
        }
        return dp[n];
    }
}
