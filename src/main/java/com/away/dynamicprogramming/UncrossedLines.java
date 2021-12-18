package com.away.dynamicprogramming;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-18 16:19
 */
public class UncrossedLines {
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i-1] == nums2[j-1]) {
                    dp[i][j] = dp[i - 1][j - 1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        return dp[nums1.length][nums2.length];
    }
}
