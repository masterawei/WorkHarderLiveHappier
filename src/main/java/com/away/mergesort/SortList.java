package com.away.mergesort;

import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2021-12-19 12:15
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        ListNode slow ,fast;
        slow = fast=head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    return null;
    }
}
