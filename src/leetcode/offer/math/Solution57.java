package leetcode.offer.math;

/**
 * 两数之和，平常的话是用hashMap存key
 * 但这里是有序的，直接双指针
 */
public class Solution57 {
    public int[] twoSum(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]==target){
                break;
            }else if(nums[l]+nums[r]>target){
                r--;
            }else{
                l++;
            }
        }
        return new int[]{nums[l], nums[r]};
    }
}
