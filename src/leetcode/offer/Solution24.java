package leetcode.offer;

import leetcode.common.list.ListNode;

/**
 * 反转链表
 */
public class Solution24 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode(-1);
        while(head!=null){
            ListNode next = head.next;
            head.next = pre.next;
            pre.next = head;
            head = next;
        }
        return pre.next;
    }
}
