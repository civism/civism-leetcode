package com.civism.leetcode;

import com.civism.common.ListNode;

public class Leetcode876 {
    public static void main(String[] args) {
        ListNode listNode6 = new ListNode(6);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode listNode = middleNode(listNode1);
        while (listNode1 != null) {
            System.out.print(listNode1.val);
            listNode1 = listNode1.next;
        }

    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
