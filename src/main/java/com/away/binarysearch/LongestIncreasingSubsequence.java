package com.away.binarysearch;

/**
 * @author away
 * @date 2021-12-27 20:34
 */
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int[] top = new int[nums.length];
        int piles = 0;
        for (int poker : nums) {
            int left = 0;
            int right = piles;
            while (left < right) {
                int mid = (right - left) / 2 + left;
                int midVal = top[mid];
                if (midVal == poker) {
                    right = mid;
                } else if (midVal > poker) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (left == piles) {
                piles++;
            }
            top[left] = poker;
        }
        return piles;
    }
}
