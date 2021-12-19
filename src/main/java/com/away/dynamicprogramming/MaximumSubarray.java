package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-19 10:50
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i];

            }else {
                dp[i] = dp[i - 1] + nums[i];
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }

    /**
     * 优化空间
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        int preMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (preMax < 0) {
                preMax = nums[i];
            }else {
                preMax += nums[i];
            }
            max = Math.max(max,preMax);
        }
        return max;
    }
}
