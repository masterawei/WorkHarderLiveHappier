package com.away.DFS;

import com.sun.org.apache.xpath.internal.operations.Plus;

/**
 * @author away
 * @date 2022-04-08 22:24
 */
public class NumberOfClosedIslands {
    class Solution {
        public int closedIsland(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            int res = 0;
            for (int i = 0; i < row; i++) {
                DFS(grid, i, 0);
                DFS(grid, i, col - 1);
            }
            for (int i = 0; i < col; i++) {
                DFS(grid, 0, i);
                DFS(grid, row - 1, i);
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == 0) {

                        res++;
                        DFS(grid, i, j);
                    }
                }
            }
            return res;
        }

        public void DFS(int[][] grid, int i, int j) {
            if (i < 0 || j < 0 || j >= grid[0].length || i >= grid.length) {
                return;
            }
            if (grid[i][j] == 1) {
                return;
            }
            grid[i][j] = 1;
            DFS(grid, i - 1, j);
            DFS(grid, i, j - 1);
            DFS(grid, i + 1, j);
            DFS(grid, i, j + 1);
        }
    }

}