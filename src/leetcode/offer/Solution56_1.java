package leetcode.offer;

/**
 * 数组中只有2个数重复了1次，其他的都重复了2次，找出这两个数
 * 1. 先将所有数异或，返回c=a^b
 * 2. 因为异或，c肯定有多位为1，表示在当前位a，b不相等，记录这个位为m
 * 将在m位为0的分成一组，为1的分成一组，这样a，b就被分到了2组
 * 分别异或这两组，得到a和b
 */
public class Solution56_1 {
    public int[] singleNumbers(int[] nums) {
        int c=0;
        for(int i:nums){
            c ^= i;
        }
        int m=1;
        while((c&m)==0){
            m = m<<1;
        }
        int a=0,b=0;
        for(int i:nums){
            if((i&m)==0){
                a ^= i;
            }else{
                b ^= i;
            }
        }
        return new int[]{a,b};
    }
}
