package leetcode.offer;

import leetcode.TreeNode;

/**
 * 二叉树寻找两个节点的最近祖先
 * 用先序遍历的思想：递归遍历左子树和右子树，递归的时候不断判断root是不是要找的目标
 * 如果left和right都不为空，说明左右子树各找到了p,q，root就是最近的公共祖先
 * 如果left不为空，right为空，有两种情况：都做出了同样的操作
 * 1. left有p和q，这时left指向最近公共祖先（因为递归里有一层是p和q在异侧，返回root），向上抛
 * 2. left有p或q，这时left指向p，也向上抛，让上层来判断
 * 如果right不为空，left为空，同理
 */
public class Solution68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(right==null) return left;
        if(left==null) return right;
        return root;
    }
}
