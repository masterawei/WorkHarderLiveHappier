package com.away.sort;

/**
 * @author away
 * @date 2021-12-22 21:01
 */
public class InsertSort {
    public int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int rt = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (rt < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = rt;
                } else {
                    break;
                }
            }

        }
        return arr;
    }
}
