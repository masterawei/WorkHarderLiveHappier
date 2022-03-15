package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2021-12-24 14:37
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }


    public ListNode deleteDuplicates2(ListNode head) {

        ListNode slow =  head;
        ListNode fast = head;
        while(fast!=null){
            while(fast!=null&&slow.val==fast.val){
                fast = fast.next;
            }
            slow.next = fast;
            slow = slow.next;

        }
        return head;
    }
}
