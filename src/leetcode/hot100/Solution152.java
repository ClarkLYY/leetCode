package leetcode.hot100;

/**
 * 乘积最大的子数组
 * dp[i]可能是之前子数组*当前的值，也可能之前的子数组太小了，不如直接要当前的值
 * 即Math.max(dpMax[i-1]*nums[i], nums[i])
 * 但因为可能之前子数组乘积是负数，当前的值也是负数，相乘就变成很大的正数，所以还要记录一个dpMin表示最小的数，找出最大的负数
 */
public class Solution152 {
    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            dpMax[i] =Math.max(dpMin[i-1]*nums[i],Math.max(dpMax[i-1]*nums[i], nums[i]));
            dpMin[i] =Math.min(dpMin[i-1]*nums[i],Math.min(dpMax[i-1]*nums[i], nums[i]));
            result = Math.max(result, dpMax[i]);
        }
        return result;
    }
}
