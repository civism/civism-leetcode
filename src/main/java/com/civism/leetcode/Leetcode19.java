package com.civism.leetcode;

import com.civism.common.ListNode;


public class Leetcode19 {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode listNode = removeNthFromEnd(listNode1, 2);
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        if (head.next == null && n > 0) {
            return null;
        }
        while (n != 0) {
            fast = fast.next;
            n--;
        }
        if (fast == null) {
            return head.next;
        } else {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }
        return head;
    }
}
