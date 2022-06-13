package com.away.priorityqueue;

import java.util.PriorityQueue;

/**
 * @author away
 * @date 2022-06-13 11:54
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int height : heights) {
            pq.offer(height);
        }
        int res = 0;
        for (int height : heights) {
            if (!pq.poll().equals(height)) {
                ++res;
            }
        }
        return res;
    }
}
