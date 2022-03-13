package leetcode.offer.tree;

import leetcode.common.tree.TreeNode;

/**
 * 判断是否为平衡二叉树
 * 先看下root节点下，是否为平衡二叉树
 * 然后再递归遍历左右子树
 */
public class Solution55_2 {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = dfs(root.left,0);
        int right = dfs(root.right,0);
        return Math.abs(left-right)<2&&isBalanced(root.left)&&isBalanced(root.right);
    }

    int dfs(TreeNode root ,int i){
        if(root==null){
            return i;
        }
        return Math.max(dfs(root.left, i+1), dfs(root.right, i+1));

    }
}
