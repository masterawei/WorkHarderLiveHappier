package com.away.logic;

import com.away.predefineddatastructure.ListNode;


import java.util.List;

/**
 * @author away
 * @date 2021-12-21 21:36
 */
public class ReverseLinkedList {
    /**
     * 迭代写法
     */
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverse(ListNode head) {
        if (head == null||head.next==null) {
            return head;
        }
        ListNode newhead = reverse(head.next);

        head.next.next = head;
        head.next = null;
        return newhead;

    }

}
