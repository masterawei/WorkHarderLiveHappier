package com.away.logic;

/**
 * @author away
 * @date 2022-07-05 14:08
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len-2;
        int j = len-1;
        int k = j;
        //
        while (i >= 0 && nums[i] < nums[j]) {
            i--;
            j--;
        }
        if (i >= 0) {
            while (nums[i]>=nums[k]) {
                k--;
            }
            swap(nums, i, k);
        }
        reverse(nums, j, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start<=end){
            swap(nums,start++,end--);
        }
    }

    private void swap(int[] nums, int i, int k) {
        int tmp = nums[i];
        nums[i] = nums[k];
        nums[k] = tmp;
    }
}
