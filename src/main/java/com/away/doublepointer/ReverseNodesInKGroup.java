package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2022-03-14 21:15
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) {
            return null;
        }

        ListNode a,b;
        a = b = head;

        for( int i = 0;i<k;i++){
            if(b==null) {
                return head;
            }
            b = b.next;
        }
        ListNode newHead = reverse(a,b);

        a.next = reverseKGroup(b,k);
        return newHead;
    }
    ListNode reverse(ListNode a,ListNode b){
        ListNode pre ,cur,nxt;
        pre = null;
        cur = a;
        nxt = a;
        while(cur!=b){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
