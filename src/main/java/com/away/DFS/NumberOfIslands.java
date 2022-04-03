package com.away.DFS;

/**
 * @author away
 * @date 2022-04-03 21:47
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    DFS(grid, i, j);
                }
            }
        }
        return res;
    }

    private void DFS(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        DFS(grid, i - 1, j);
        DFS(grid, i , j- 1);
        DFS(grid, i + 1, j);
        DFS(grid, i , j+ 1);
    }
}
