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
                    max = Math.max(max,DFS(grid,i,j,0));
                }
            }
        }
        return max;
    }

    private int DFS(int[][] grid, int i, int j, int cur) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return cur;
        }
        if (grid[i][j] == 0) {
            return cur;
        }

        grid[i][j]  = 0;
        cur++;

        int c1 = DFS(grid, i - 1, j, cur);
        int c2 = DFS(grid, i , j- 1, c1);
        int c3 = DFS(grid, i + 1, j, c2);

        return DFS(grid, i , j+1, c3);

    }
}
