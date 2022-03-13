package leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 给一个target，找出所有和为target的连续正数数列（至少2个数）
 * 滑动窗口法
 */
public class Solution57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int limit = target/2+1;
        int l=1,r=2;
        while(l<r){
            int sum = (l+r)*(r-l+1)/2;
            if(sum==target){
                int[] nums = new int[r-l+1];
                for(int i=l;i<=r;i++){
                    nums[i-l] = i;
                }
                list.add(nums);
                l++;
            }else if(sum>target){
                l++;
            }else{
                r++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
