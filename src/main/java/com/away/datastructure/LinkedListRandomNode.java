package com.away.datastructure;

import com.away.predefineddatastructure.ListNode;

import java.util.Random;

/**
 * @author away
 * @date 2022-04-26 11:27
 */
public class LinkedListRandomNode {
    Random r;
    ListNode head;

    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        r = new Random();
    }

    public int getRandom() {
        int i =0;
        int res = 0;
        ListNode p = head;
        while (p != null) {
            i++;
            if (0 == r.nextInt(i)) {
                res = p.val;
            }
            p =p.next;
        }
        return res;
    }
}
