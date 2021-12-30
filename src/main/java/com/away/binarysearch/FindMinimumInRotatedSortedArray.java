package com.away.binarysearch;

/**
 * @author away
 * @date 2021-12-30 20:47
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int mid = (right+left)/2;
            int midVal =  nums[mid];
            if (midVal > nums[right]) {
                left = mid+1;
            } else  {
                right = mid;
            }
        }
        return nums[left];
    }


}
