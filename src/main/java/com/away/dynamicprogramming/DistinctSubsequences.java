package com.away.dynamicprogramming;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-20 8:42
 */
public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length() + 1][s.length() + 1];
        Arrays.fill(dp[0], 1);
        dp[0][0] = 0;
        for (int i = 1; i <= t.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (j < i) {
                    continue;
                }
                if (t.charAt(i-1) == s.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1]+ dp[i][j - 1] ;
                }else {
                    dp[i][j] =  dp[i][j - 1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}
