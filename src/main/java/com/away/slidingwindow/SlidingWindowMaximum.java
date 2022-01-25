package com.away.slidingwindow;

import java.util.LinkedList;

/**
 * @author away
 * @date 2022-01-25 13:30
 * 这是一道单队列的题目,使用到了滑动窗口,也可以说不是滑动窗口
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1) {
            return new int[]{nums[0]};
        }
        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k+1];
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.addLast(i);
            if (queue.peek() == i - k) {
                queue.poll();
            }
            if (i + 1 - k >= 0) {
                res[i + 1 - k] = nums[queue.peek()];
            }
            }
        return res;
        }



}
