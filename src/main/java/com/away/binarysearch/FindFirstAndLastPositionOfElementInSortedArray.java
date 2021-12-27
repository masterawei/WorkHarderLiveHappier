package com.away.binarysearch;

/**
 * @author away
 * @date 2021-12-27 19:12
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1,-1};
        }
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (right-left)/2+left;
            int midVal = nums[mid];
            if (midVal >= target) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        if (left == nums.length||nums[left]!=target) {
            return new int[]{-1, -1};
        }
        int[] res= new int[2];
        res[0] = left;
        left = 0;
        right = nums.length;
        while (left < right) {
            int mid = (right-left)/2+left;
            int midVal = nums[mid];
            if (midVal <= target) {
                left=mid+1;
            } else {
                right = mid;
            }
        }
        res[1] = left-1;
        return res;
    }
}
