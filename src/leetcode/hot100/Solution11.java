package leetcode.hot100;

/**
 * 盛最多水的容器，双指针
 */
public class Solution11 {
    public int maxArea(int[] height) {
        int max=0,left=0,right=height.length-1;
        while(left<right){
            int water = Math.min(height[left],height[right])*(right-left);
            if(water>max) max=water;
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}
