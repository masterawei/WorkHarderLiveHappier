package com.away.DFS;

/**
 * @author away
 * @date 2022-04-19 21:59
 */
public class WordSearchSubmissions {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(dfs(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,int i,int j,String s,int idx){
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if (board[i][j] != s.charAt(idx)) {
            return false;
        }
        if (idx == s.length() - 1) {
            return true;
        }
        char tmp = board[i][j] ;
        board[i][j] = '.';
        boolean res = dfs(board,i-1,j,s,idx+1)||dfs(board,i,j-1,s,idx+1)
                ||dfs(board,i,j+1,s,idx+1)||dfs(board,i+1,j,s,idx+1);
        board[i][j] = tmp;
        return res;
    }
}
