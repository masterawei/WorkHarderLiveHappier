package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-18 15:44
 */
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int len = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            }else {
                len=1;
            }
            max = Math.max(len,max);
        }
        return max;
    }
}
