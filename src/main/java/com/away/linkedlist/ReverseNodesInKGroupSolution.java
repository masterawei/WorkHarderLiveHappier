package com.away.linkedlist;

import com.away.predefineddatastructure.ListNode;
import com.away.predefineddatastructure.TreeNode;

/**
 * @author away
 * @date 2021-12-24 13:00
 */
public class ReverseNodesInKGroupSolution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode tail = head;
        ListNode pre = head;
        ListNode newHead = head;
        boolean flag = true;
        while (true) {
            int len=0;
            for (int i = 0; i < k; i++) {
                if (tail != null) {
                    tail = tail.next;
                    len++;
                }
            }
            if (tail == null&&len<k) {
                break;
            }
            if (flag) {
                newHead = reverse(cur, tail);
                flag = false;
            }else {
               pre.next = reverse(cur, tail);
            }
           pre = cur;
            cur = tail;

        }
        return newHead;
    }

    ListNode reverse(ListNode head, ListNode tail) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode pre = tail;
        while (cur != tail) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;


    }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode cur = dummy;
            while(head!=null){
                int cnt = 0;
                ListNode tmp = head;
                for(int i = 0;i<k;i++){
                    if(head==null){
                        break;
                    }
                    cnt++;
                    head = head.next;
                }
                if(head==null&&cnt<k){
                    break;
                }
                ListNode newHead = reverse(tmp,head);
                cur.next = newHead;
                cur = tmp;

            }
            return dummy.next;

        }
        ListNode reverse(ListNode head, ListNode tail) {
            if (head == null) {
                return null;
            }
            ListNode cur = head;
            ListNode pre = tail;
            while (cur != tail) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }
    }
}
