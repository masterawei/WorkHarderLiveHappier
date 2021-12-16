package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2021-12-15 15:12
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dual = new ListNode();
        ListNode cur = dual;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                cur.next = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                cur.next = list1;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        return dual.next;
    }
}
