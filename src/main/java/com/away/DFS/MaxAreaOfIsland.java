package com.away.DFS;

/**
 * @author away
 * @date 2022-04-04 23:58
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max,DFS(grid,i,j));
                }
            }
        }
        return max;
    }

    private int DFS(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] == 0) {
            return 0;
        }

        grid[i][j]  = 0;

        return DFS(grid, i , j+1)+DFS(grid, i + 1, j)+DFS(grid, i , j- 1)+DFS(grid, i - 1, j)+1;

    }
}
