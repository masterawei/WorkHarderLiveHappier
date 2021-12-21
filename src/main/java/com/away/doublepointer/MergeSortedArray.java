package com.away.doublepointer;

import java.util.logging.Level;

/**
 * @author away
 * @date 2021-12-21 21:57
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length;
        while (n > 0) {
            if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[--i] = nums1[--m];
            }else {
                nums1[--i] = nums2[--n];
            }
        }
    }
}
