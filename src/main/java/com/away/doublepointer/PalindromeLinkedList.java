package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

import java.util.ArrayList;

/**
 * @author away
 * @date 2021-12-16 14:52
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow ;
        ListNode fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast!= null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }

        return true;
    }
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur;
        ListNode nxt;
        cur = head;
        while (cur != null) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
