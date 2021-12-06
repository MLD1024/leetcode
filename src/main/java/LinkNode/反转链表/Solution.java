package LinkNode.反转链表;

import LinkNode.ListNode;

/**
 * @author Lz
 * @date 2021/11/16 19:30
 * @since 1.0.0
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */

public class Solution {
    // 迭代
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}


class Solution2 {
    // 递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

