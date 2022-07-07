package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2022-07-07 10:21
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] dp = new int[r][c];
        int maxLen = 0;
        for (int i = 0; i < c; i++) {
            dp[0][i] = matrix[0][i]-'0';
            if(matrix[0][i]=='1'){
                maxLen = 1;
            }
        }

        for (int i = 0; i < r; i++) {
            dp[i][0] = matrix[i][0]-'0';
            if(matrix[i][0]=='1'){
                maxLen=1;
            }
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == '0') {
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1])+1;
                }
                maxLen = Math.max(dp[i][j],maxLen);
            }
        }
        return maxLen*maxLen;

    }

    public int min(int a, int b, int c) {
        return Math.min(a , Math.min(b,c));
    }
}
