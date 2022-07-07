package com.away.logic;

/**
 * @author away
 * @date 2022-07-07 9:06
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        for(int i =0;i<size/2;i++){
            for(int j = 0;j<size;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][size-j-1];
                matrix[i][size-j-1] = tmp;
            }
        }
    }

}
