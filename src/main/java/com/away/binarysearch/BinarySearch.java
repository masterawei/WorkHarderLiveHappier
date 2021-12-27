package com.away.binarysearch;

/**
 * @author away
 * @date 2021-12-27 19:42
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (right-left)/2+left;
            int midVal = nums[mid];
            if (midVal == target) {
                return mid;
            } else if (midVal > target) {
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = (right-left)/2+left;
            int midVal = nums[mid];
            if (midVal == target) {
                return mid;
            } else if (midVal > target) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
}
