package leetcode.offer;

/**
 * 找到[0~n-1]递增有序序列中，不存在的数字
 * 比如[0,1,2,3,5,6,7]，返回4
 * 二分法，将数组分成两部分：num[i]==i [0,1,2,3]和num[i]!=i [5,6,7]
 * 不等于的那个数组首个元素的下标就是缺失的数字
 */
public class Solution53_2 {
    public int missingNumber(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<=r){
            int mid = l+ (r-l)/2;
            if(nums[mid]==mid) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
}
