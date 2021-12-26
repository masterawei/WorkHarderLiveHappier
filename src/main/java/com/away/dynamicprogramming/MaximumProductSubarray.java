package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-24 14:20
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        //分别用来存到第i个元素的最大值和最小值
        int[][] dp = new int[nums.length][2];
        int max = nums[0];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(nums[i], Math.max(dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i]));
            dp[i][1] = Math.min(nums[i], Math.min(dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i]));
            max = Math.max(max,dp[i][0]);
        }
        return max;
    }
}
