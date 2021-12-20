package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-20 10:53
 */
public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = len - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)&&isPalindrome(s, i + 1, j - 1)) {
                    dp[i][j] = dp[i+1][j-1]+2;
                }else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
                }
            }
        return dp[0][len - 1];
    }

    boolean isPalindrome(String s, int start, int end) {
        while (end > start) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}
