package leetcode.hot100;

/**
 * 跳格子1，看看能不能调到最后格子
 * 贪心，如果能跳到最远的格子，和上一次跳到最远的格子相同，说明跳不到最后
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        for(int i=0;i<nums.length-1;i++){
            maxPosition = Math.max(maxPosition, nums[i]+i);
            if(end==i){
                if(end==maxPosition) return false;
                end = maxPosition;
            }
        }
        return true;
    }
}
