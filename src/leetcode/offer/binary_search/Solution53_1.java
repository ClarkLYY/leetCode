package leetcode.offer.binary_search;
/**
 * 统计一个数字在排序数组中出现的次数。
 * 因为是排序数组，可以用二分法降低时间复杂度
 * 分别二分查找target的左右边界
 * right-left-1即为target的个数
 */

public class Solution53_1 {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]<=target) l = mid +1;
            else r = mid-1;
        }
        int right=l;
        l=0;
        r=nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]<target) l = mid +1;
            else r = mid-1;
        }
        int left=r;
        return right-left-1;
    }
}
