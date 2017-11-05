package com.robin;

/**
 * Created by yunshi on 5/11/17.
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean shift = false;
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        ListNode head = null;
        ListNode resultPointer = null;
        while (pointer1 != null || pointer2 != null || shift) {
            int value1 = pointer1 != null ? pointer1.val : 0;
            int value2 = pointer2 != null ? pointer2.val : 0;
            int value;

            if (pointer1 != null) {
                pointer1 = pointer1.next;
            }

            if (pointer2 != null) {
                pointer2 = pointer2.next;
            }

            if (shift) {
                value = value1 + value2 + 1;
                shift = false;
            } else {
                value = value1 + value2;
            }

            if (value >= 10) {
                shift = true;
                value %= 10;
            }

            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                resultPointer = newNode;
            } else {
                resultPointer.next = newNode;
                resultPointer = newNode;
            }
        }

        return head;

    }
}
