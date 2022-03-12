package leetcode.offer;

import leetcode.TreeNode;

/**
 * 二叉搜索树，直接根据root值和p、q的值判断
 * 如果p<=root<=q，root就是最近的祖先
 * 不是就root=root.left或root.right
 */
public class Solution68_1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if(root.val>p.val&&root.val>q.val){
                root=root.left;
                continue;
            }
            if(root.val<p.val&&root.val<q.val){
                root=root.right;
                continue;
            }
            break;
        }
        return root;
    }
}
