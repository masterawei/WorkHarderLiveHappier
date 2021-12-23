package com.away.sort;

/**
 * @author away
 * @date 2021-12-23 21:59
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        int lo = 0;
        int hi = nums.length-1;
        k = nums.length-k;
        while (lo <= hi) {
            int p = partition(nums, lo, hi);
            if (p > k) {
                hi = p-1;
            } else if (p < k) {
                lo = p + 1;
            } else {
                return nums[p];
            }

        }
        return -1;
    }

    private int partition(int[] nums, int lo, int hi) {
        if (lo == hi) {
            return lo;
        }
        int pivot = nums[lo];
        int i = lo;
        int j = hi+1;
        while (true) {
            while (nums[++i] < pivot) {
                if (i == hi) {
                    break;
                }
            }
            while (nums[--j] > pivot) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, j, lo);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
