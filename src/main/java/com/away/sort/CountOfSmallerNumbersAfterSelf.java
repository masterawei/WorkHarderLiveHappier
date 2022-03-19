package com.away.sort;

import java.lang.reflect.Array;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author away
 * @date 2022-03-20 0:50
 */
public class CountOfSmallerNumbersAfterSelf {
    private class Pair{
        int val,id;

        Pair(int val, int id) {
            this.val = val;
            this.id = id;
        }
    }

    private Pair[] tmp;

    private int[] count;
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        tmp = new Pair[n];
        count = new int[n];

        Pair[] arr = new Pair[n];
    //    记录元素原始的索引位置
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        sort(arr, 0, n - 1);

        return Arrays.stream(count).boxed().collect(Collectors.toList());
    }

    private void sort(Pair[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (high - low) / 2 + low;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr,low,mid,high);
    }

    private void merge(Pair[] arr, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
                tmp[i] = arr[i];
        }
        int i = low;
        int j = mid+1;
        for (int p = low; p <= high; p++) {
            if (i == mid + 1) {
                arr[p] = tmp[j++];
            } else if (j == high + 1) {
                arr[p] = tmp[i++];
                count[arr[p].id]+=j-mid-1;
            } else if (tmp[i].val > tmp[j].val) {
                arr[p] = tmp[j++];
            }else {
                arr[p] = tmp[i++];
                count[arr[p].id]+=j-mid-1;
            }
        }
    }
}

