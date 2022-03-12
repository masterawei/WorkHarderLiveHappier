package com.away.doublepointer;

import com.away.predefineddatastructure.ListNode;

/**
 * @author away
 * @date 2022-03-12 13:31
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aHead = headA;
        ListNode bHead = headB;
        while(aHead!=bHead){
            if(aHead==null){
                aHead = headB;
            }else{
                aHead = aHead.next;
            }
            if(bHead==null){
                bHead = headA;
            }else{
                bHead = bHead.next;
            }


        }
        return aHead;
    }
}
