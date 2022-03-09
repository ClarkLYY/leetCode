package leetcode.hot100;

/**
 * 接雨水，动态规划
 * 算出当前格子i左边的最大高度和右边的最大高度，然后当前格子的接水为：
 * min(leftMax[i], rightMax[i])-height[i]
 * 在算当前格子的最大高度使用动态规划，算左边则从左向右遍历，算右边从右向左遍历
 * leftMax[i] = Max(leftMax[i-1],height[i])
 * rightMax[i] = Max(rightMax[i-1],height[i])
 */
public class Solution42 {
    public int trap(int[] height) {
        int result = 0;
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for(int i=0;i<n;i++){
            result += Math.min(leftMax[i], rightMax[i])-height[i];
        }
        return result;
    }
}
