package test;

public class Solution3 {
    public long GetSubArrayMaxProduct(long[] nums) {
        // write code here
        long result=1;
        for(int i=0;i<nums.length;i++){
            long target=1;
            for(int j=i;j<nums.length;j++){
                target*=nums[j];
                result=Math.max(target, result);
            }
        }
        return result;
    }
}
