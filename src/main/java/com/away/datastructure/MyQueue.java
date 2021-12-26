package com.away.datastructure;

import java.util.Stack;


/**
 * @author away
 * @date 2021-12-24 14:02
 */
public class MyQueue {
    Stack<Integer> s1 ;
    Stack<Integer> s2 ;
    int size;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        size =0;
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        peek();
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
