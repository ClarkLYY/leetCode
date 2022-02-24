package leetcode.hot100;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 倒数第k大的数，topk问题
 */
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
//        HashSet<Integer> set = new HashSet<>();
//        for(int i:nums){
//            set.add(i);
//        }
//        Integer[] nums2 = set.toArray(new Integer[]{});
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
