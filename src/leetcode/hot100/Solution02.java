package leetcode.hot100;

import leetcode.ListNode;

/**
 * 两数相加，链表，注意进位
 */
public class Solution02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode head=null, tail=null;
        while(l1!=null||l2!=null){
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1+v2+carry;
            if(head==null){
                head = tail = new ListNode(sum %10);
            }else{
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0){
            tail.next = new ListNode(1);
        }
        return head;
    }
}
