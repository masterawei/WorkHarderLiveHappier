package com.away.sort;

import com.away.predefineddatastructure.ListNode;

import java.util.List;

/**
 * @author away
 * @date 2022-07-05 10:25
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null||head.next==null) {
            return null;
        }
        ListNode midNode = findMid(head);
        ListNode rightHead = midNode.next;
        midNode.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        return sort(left,right);

    }

    private ListNode sort(ListNode left, ListNode right) {
        ListNode newHead = new ListNode();
        ListNode head = newHead;
        while (left != null && right != null) {
            if (left.val< right.val){
                head.next = left;
                left = left.next;
            }else{
                head.next = right;
                right = right.next;
            }
            head = head.next;
        }
        if (left == null) {
            head.next = right;
        }
        if (right == null) {
            head.next = left;
        }
        return newHead.next;

    }

    private ListNode findMid(ListNode head) {
        if (head == null||head.next==null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
