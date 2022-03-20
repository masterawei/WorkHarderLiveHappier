package com.away.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author away
 * @date 2022-03-20 17:13
 */
public class QuickSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(bf.readLine());
        }
        quickSort(nums, 0, n - 1);

        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = findPivot(nums, low, high);
        quickSort(nums, low, pivot);
        quickSort(nums, pivot+1, high);

    }

    private static int findPivot(int[] nums, int low, int high) {

        int num = nums[low];
        int i = low;
        int j = high+1;
        while (true) {
            while (nums[++i] < num) {
                if (i == high) {
                    break;
                }
            }
            while (nums[--j] > num) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }

            swap(nums, i, j);

        }
        swap(nums, j, low);
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
