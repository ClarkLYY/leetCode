package leetcode.offer;

import leetcode.common.tree.Node;

/**
 * 将二叉搜索树转换成双向链表
 * 中序遍历，使用pre、head记录上次遍历的节点和头结点
 */
public class Solution36 {
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        if(root==null) return root;
        dfs(root);
        pre.right=head;
        head.left=pre;
        return head;
    }
    private void dfs(Node root){
        if(root==null) return;
        dfs(root.left);
        if(pre==null){
            head = root;
        }else{
            pre.right=root;
            root.left = pre;
        }

        pre = root;
        dfs(root.right);
    }
}
