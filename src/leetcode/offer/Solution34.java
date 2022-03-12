package leetcode.offer;

import leetcode.common.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树路径和，递归回溯
 */
public class Solution34 {
    LinkedList<Integer> list = new LinkedList<>();
    int sum=0;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)return result;
        list.add(root.val);
        sum+=root.val;
        backtrack(result, root, target);
        return result;
    }

    private void backtrack(List<List<Integer>> result, TreeNode root, int target) {
        if(root.left==null&&root.right==null){
            if(sum==target) result.add(new LinkedList<>(list));
        }else{
            if(root.left!=null){
                int val = root.left.val;
                list.add(val);
                sum+=val;
                backtrack(result, root.left, target);
                sum-=val;
                list.removeLast();
            }
            if(root.right!=null){
                int val = root.right.val;
                list.add(val);
                sum+=val;
                backtrack(result, root.right, target);
                sum-=val;
                list.removeLast();
            }
        }
    }
}
