package leetcode.offer.list;

import leetcode.common.list.ListNode;

import java.util.ArrayList;

/**
 * 从尾到头打印链表值
 */
public class Solution6 {
    ArrayList<Integer> list = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        dfs(head);
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    void dfs(ListNode head){
        if(head==null) return;
        dfs(head.next);
        list.add(head.val);
    }
}
