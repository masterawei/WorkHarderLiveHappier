package com.away.DFS;

/**
 * @author away
 * @date 2022-04-04 22:37
 */
public class CountSubIslands {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int row = grid1.length;
        int col = grid1[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid1[i][j] == 0 && grid2[i][j] == 1) {
                    DFS(grid2, i, j);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid2[i][j]==1){
                    res++;
                    DFS(grid2, i, j);
                }

            }
        }
        return res;
    }

    private void DFS(int[][] grid2, int i, int j) {
        if (i < 0 || j < 0 || i >= grid2.length || j >= grid2[0].length) {
            return;
        }
        if (grid2[i][j] == 0) {
            return;
        }
        grid2[i][j] =0;
        DFS(grid2,i-1,j);
        DFS(grid2,i,j-1);
        DFS(grid2,i+1,j);
        DFS(grid2,i,j+1);
    }
}
