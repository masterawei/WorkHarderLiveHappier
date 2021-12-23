package com.away.sort;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author away
 * @date 2021-12-22 21:05
 */
public class SortAnArray {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }

    void sort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        //通过交换元素构建分界点索引p
        int p = partition(nums,lo,hi);
        sort(nums, lo, p - 1);
        sort(nums, p + 1, hi);
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

            swap(nums,i,j);
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
