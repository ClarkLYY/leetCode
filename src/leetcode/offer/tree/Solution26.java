package leetcode.offer.tree;

import leetcode.common.tree.TreeNode;

/**
 * 判断B是否为A的子结构，分两步
 * 1. 判断A根节点开始是否和B结构一致isSame
 * 2. 递归判断A.left和A.right
 */
public class Solution26 {
    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if(B==null||A==null) return false;
            // TreeNode root = findRoot(A, B);
            return isSame(A, B)||isSubStructure(A.left,B) ||isSubStructure(A.right, B);
        }
//        TreeNode findRoot(TreeNode A, TreeNode B){
//            if(A==null||B==null) return null;
//            if(A.val==B.val) return A;
//            TreeNode left = findRoot(A.left, B);
//            TreeNode right = findRoot(A.right, B);
//            if(left!=null) return left;
//            if(right != null) return right;
//            return null;
//        }

        boolean isSame(TreeNode root, TreeNode B){
            if(B==null) return true;
            if(root==null||root.val!=B.val) return false;
            return isSame(root.left, B.left) && isSame(root.right, B.right);
        }
    }
}
