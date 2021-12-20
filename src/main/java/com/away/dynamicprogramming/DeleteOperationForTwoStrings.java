package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-20 9:14
 * 先在这里做一个小总结，如果两个字符串可以双向奔赴的话，那么就会有dp[i - 1][j], dp[i][j - 1],否则就只有一个方向的变化
 */
public class DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i <= word2.length(); i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
