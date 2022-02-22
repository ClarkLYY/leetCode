package leetcode.hot100;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 三数之和，双指针遍历，
 * 先排序，
 * 然后固定一个i，然后left=i+1，right=length-1
 * 然后加起来看是否为0
 * 不是的话就left++，right--
 * 注意重复
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0) break;
            if(i>0&&nums[i]==nums[i-1])continue;
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    result.add(list);
                    while(nums[l]==nums[l+1]){
                        l++;
                    }
                    l++;
                    while(nums[r]==nums[r-1]){
                        r--;
                    }
                    r--;
                }else if(nums[i]+nums[l]+nums[r]>0){
                    r--;
                }else if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
            }
        }
        return result;
    }
}
