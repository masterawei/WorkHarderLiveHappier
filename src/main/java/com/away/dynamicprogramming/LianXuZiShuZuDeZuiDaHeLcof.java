package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-14 15:08
 */
public class LianXuZiShuZuDeZuiDaHeLcof {
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        int preStart = 0;
        int preEnd = 0;
        int startIdx = 0;
        int endIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i];
                preEnd=i;
                preStart =i;
            } else {
                dp[i] = dp[i - 1] + nums[i];
                preEnd++;
            }
            if (max < dp[i]) {
                max = dp[i];
                startIdx = preStart;
                endIdx = preEnd;
            }

        }

        System.out.println(startIdx+ " " +endIdx);
        return max;
    }
}
