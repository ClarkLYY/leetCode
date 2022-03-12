package leetcode.offer;

import leetcode.common.tree.TreeNode;

/**
 * 二叉搜索树寻找倒数第k大的值
 * 二叉搜索树的中序遍历是正序，那中序的翻转就是倒序，即【右-根-左】
 * 在类维护一个k变量，递归的时候就k--，如果k==0，说明找到了
 */
public class Solution54 {
    int ans,k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return this.ans;
    }
    void dfs(TreeNode root){
        if(root==null) return;
        if(root.right!=null) dfs(root.right);
        if(k==0)return;
        k--;
        if(k==0){
            ans=root.val;
            return;
        }
        if(root.left!=null) dfs(root.left);
    }
}
