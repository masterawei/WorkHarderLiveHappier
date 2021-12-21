package com.away.monotonicstack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author away
 * @date 2021-12-21 21:14
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }else {
                //如果不为空,而且顶部元素较大,那么就入栈
                int idx = stack.peek();
                if (temperatures[i] < temperatures[idx]) {
                    stack.push(i);
                }else {
                    //否则栈顶元素小,弹栈,直到栈空,或者栈顶元素大于当前元素
                    //注意:对栈空的判断要在数据判断之前
                    while ( !stack.isEmpty()&&temperatures[stack.peek()] < temperatures[i]) {
                        res[stack.peek()] = i-stack.peek();
                        stack.pop();
                    }
                    stack.push(i);
                }
            }
        }
        return res;
    }
}
