package com.away.sort;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.PriorityQueue;

/**
 * @author away
 * @date 2022-03-20 22:12
 */
public class KthLargestElementInAnArraySubmissions {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2)->o2-o1);
        for(int num:nums){
            pq.offer(num);
        }
        int res = 0;
        while(k-->0){
            res = pq.poll();
        }
        return res;

    }

    public int findKthLargest2(int[] nums, int k) {
        int low =0;
        int high = nums.length-1;

        k = nums.length-k;
        while (low <= high) {
            int pivot = partition(nums, low, high);
            if (pivot < k) {
                low = pivot+1;
            } else if (pivot > k) {
                high = pivot-1;
            } else {
                return nums[pivot];
            }
        }
        return -1;
    }

    private int partition(int[] nums, int low, int high) {
        if (low == high) {
            return low;
        }
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
        swap(nums, low, j);

        return j;



    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
