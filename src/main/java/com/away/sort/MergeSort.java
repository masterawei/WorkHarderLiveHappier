package com.away.sort;

import com.away.predefineddatastructure.ListNode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author away
 * @date 2022-03-17 22:05
 *
 * 有一点需要注意：而且很重要，tmp数组最好在一开始的时候就new出来，否则在递归过程中将重复new数组
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sort(nums,0,n-1);

        System.out.println(Arrays.toString(nums));


    }

    public static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (high-low)/2+low;
        sort(nums,low,mid);
        sort(nums, mid + 1, high);

        merge(nums,low,mid,high);
    }

    private static void merge(int[] nums, int low, int mid, int high) {

        if (low == high) {
            return;
        }
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        int i =low;
        int j = mid+1;
        for (int p = low; p <= high; p++) {
            if (i == mid + 1) {
                nums[p]= tmp[j++];
            } else if (j == high + 1) {
                nums[p] = tmp[i++];
            } else if (tmp[i] > tmp[j]) {
                nums[p] = tmp[j++];
            }else {
                nums[p] = tmp[i++];
            }
        }

    }
}
