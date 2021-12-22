package com.away.sort;

/**
 * @author away
 * @date 2021-12-22 20:46
 */
public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }
}
