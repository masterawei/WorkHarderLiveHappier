package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

import java.util.PriorityQueue;

/**
 * @author away
 * @date 2022-03-02 22:48
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((l1,l2)->l1.val-l2.val);
        for (ListNode listNode : lists) {
            if (listNode != null) {
                pq.offer(listNode);
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            cur.next = node;
            if (node.next != null) {
                pq.offer(node.next);
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}
