package leetcode.offer;

import leetcode.common.tree.TreeNode;

/**
 * 二叉树的最大深度。dfs或bfs
 */
public class Solution55_1 {
    int max=0;
    public int maxDepth(TreeNode root) {
        dfs(root ,0);
        return max;
    }

    void dfs(TreeNode root ,int i){
        if(root==null){
            max = Math.max(max, i);
            return;
        }
        dfs(root.left, i+1);
        dfs(root.right, i+1);
    }
}
