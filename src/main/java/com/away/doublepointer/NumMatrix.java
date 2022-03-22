package com.away.doublepointer;

/**
 * @author away
 * @date 2022-03-22 21:29
 */
public class NumMatrix {

    private int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {

        sumMatrix = new int[matrix.length][matrix[0].length];
        for (int i =0;i<matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++) {
                if (j==0){
                    sumMatrix[i][j] =matrix[i][j];
                }else {
                    sumMatrix[i][j] = sumMatrix[i][j - 1] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        for (int i = row1; i <=row2 ; i++) {
            res = res+sumMatrix[i][col2];
            res = col1 == 0 ? res : res - sumMatrix[i][col1 - 1];
        }
       return res;

    }
}
