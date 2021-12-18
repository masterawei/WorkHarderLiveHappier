package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-18 15:51
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        if (len2 > len1) {
            return 0;
        }
        int[][] dp = new int[len2 + 1][len1 + 1];
        for (int i = 1; i <= len2; i++) {
            for (int j = 1; j <= len1; j++) {
                if (text2.charAt(i-1) == text1.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len2][len1];
    }
}
