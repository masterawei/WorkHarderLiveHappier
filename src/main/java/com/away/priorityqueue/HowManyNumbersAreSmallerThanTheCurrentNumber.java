package com.away.priorityqueue;

import java.util.Comparator;
import java.util.Currency;
import java.util.PriorityQueue;

/**
 * @author away
 * @date 2022-05-25 11:23
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((Comparator.comparingInt(o -> o[0])));
        int pre = -1;
        int count = 0;
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        while (!pq.isEmpty()) {
            int[] min = pq.poll();
            if (min[0] == pre) {
                res[min[1]] = count;
            }else {
                count = len-pq.size()-1;
                res[min[1]] = count;
                pre = min[0];
            }
        }
        return res;
    }
}
