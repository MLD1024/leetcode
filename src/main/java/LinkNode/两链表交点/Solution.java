package LinkNode.两链表交点;

import LinkNode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Lz
 * @date 2021/11/16 19:13
 * @since 1.0.0
 * 给你两个单链表的头节点 headA 和 headB ，
 * 请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null 。
 */
public class Solution {


    /**
     * 哈希集合
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * 双指针
     * 每步操作需要同时更新指针 pA\textit{pA}pA 和 pB\textit{pB}pB。
     *
     * 如果指针 pA\textit{pA}pA 不为空，则将指针 pA\textit{pA}pA 移到下一个节点；如果指针 pB\textit{pB}pB 不为空，则将指针 pB\textit{pB}pB 移到下一个节点。
     *
     * 如果指针 pA\textit{pA}pA 为空，则将指针 pA\textit{pA}pA 移到链表 headB\textit{headB}headB 的头节点；如果指针 pB\textit{pB}pB 为空，则将指针 pB\textit{pB}pB 移到链表 headA\textit{headA}headA 的头节点。
     *
     * 当指针 pA\textit{pA}pA 和 pB\textit{pB}pB 指向同一个节点或者都为空时，返回它们指向的节点或者 null\text{null}null
     *
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        // pA 走headA+headB
        // pB 走headB+headA
        // 走后他们一定会在终点相遇 提前相遇的点 便是两个链表的交点
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}

