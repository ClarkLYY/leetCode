package leetcode.hot100;

/**
 *跳格子2，跳到最后格子所需要的最少步数
 * 贪心，每次都选能跳到：能跳到最远的格子nums[i]+i
 */
public class Solution45 {
    public int jump(int[] nums) {
        int maxPosition=0;
        int end=0;
        int step=0;
        for(int i=0;i<nums.length;i++){
            maxPosition = Math.max(maxPosition, i+nums[i]);
            if(i==end){
                end = maxPosition;
                step++;
            }
        }
        return step;
    }
}
