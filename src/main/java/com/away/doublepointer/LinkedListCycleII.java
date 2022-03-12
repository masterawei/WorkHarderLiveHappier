package com.away.doublepointer;

import com.away.mergesort.SortList;
import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2022-03-10 23:02
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != fast) {
            return null;
        }else {
            slow = dummy;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
}
