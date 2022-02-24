package com.away.doublepointer;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author away
 * @date 2022-02-24 15:42
 */
public class AdvantageShuffleSubmissions {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        PriorityQueue<int[]> maxQue = new PriorityQueue<>(
                (a1,a2)->a2[1]-a1[1]
        );

        Arrays.sort(nums1);

        for (int i = 0; i < nums2.length; i++) {
            maxQue.add(new int[]{i, nums1[i]});
        }

        int[] res = new int[nums1.length];
        int left = 0;
        int right = nums1.length-1;
        while (!maxQue.isEmpty()) {
            int[] max = maxQue.poll();
            int index = max[0],maxVal = max[1];
            if (nums1[right] > maxVal) {
                res[index] = nums1[right];
                right--;}
            else {
                res[index] = nums1[left];
                left++;
            }
        }
        return res;
    }
}
