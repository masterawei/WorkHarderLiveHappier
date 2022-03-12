package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2022-03-12 13:33
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
