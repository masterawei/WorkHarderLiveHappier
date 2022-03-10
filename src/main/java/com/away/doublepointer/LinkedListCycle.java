package com.away.doublepointer;

import com.away.mergesort.SortList;
import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2022-03-10 22:42
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null&&fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
