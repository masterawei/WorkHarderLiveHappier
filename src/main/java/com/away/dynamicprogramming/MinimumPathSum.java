package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-13 11:08
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < col; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        int min;
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    min = dp[i][j - 1];
                    System.out.println("right");
                }else {
                    min = dp[i-1][j];
                    System.out.println("down");
                }
                dp[i][j] = grid[i][j]+min;
            }
        }

        return dp[row - 1][col - 1];
    }
}
