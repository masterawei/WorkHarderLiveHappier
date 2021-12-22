package com.away.sort;

/**
 * @author away
 * @date 2021-12-22 20:52
 */
public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        int[] res = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    idx = j;
                }
            }
            res[i] = min;
            nums[idx] = Integer.MAX_VALUE;
        }
        return res;
    }
}
