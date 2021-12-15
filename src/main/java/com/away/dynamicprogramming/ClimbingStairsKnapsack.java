package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-15 9:46
 * 这是70题使用完全背包解决的代码,主要是用来培养完全背包问题的解决思想.
 * 时间复杂度,由于内层的循环每次都只有2,所以时间复杂度为O(2n)=O(n)
 */
public class ClimbingStairsKnapsack {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        //考虑顺序的完全背包,把背包容量放在外面
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=2 ; j++) {
                if (i >= j) {
                    dp[i] = dp[i] + dp[i - j];
                }
            }
        }
        return dp[n];
    }
}
