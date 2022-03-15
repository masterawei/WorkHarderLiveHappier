package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2022-03-15 21:55
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre =dummy;
        for(int i =1;i<left;i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = left;i<right;i++){
            ListNode nxt = head.next;
            head.next = nxt.next;
            nxt.next = pre.next;
            pre.next = nxt;
        }
        return dummy.next;
    }
}
