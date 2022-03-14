package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2022-03-14 20:34
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 这种写法是最优的
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
