package com.away.binarysearch;

/**
 * @author away
 * @date 2022-04-28 9:50
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0]==target?0:-1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (right-left)/2+left;
            int midVal = nums[mid];
            if (midVal == target) {
                return mid;
            }
            if (midVal>=nums[left]){
                if (target < midVal && target >= nums[left]) {
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if (target > midVal && target <= nums[right]) {
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
