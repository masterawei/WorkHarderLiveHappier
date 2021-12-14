package com.away.dynamicprogramming;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-14 14:42
 */
public class CombinationSumIv {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0]=1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j<nums.length&&nums[j] <= i; j++) {
                if (i - nums[j] >= 0) {
                    dp[i] = dp[i] + dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
