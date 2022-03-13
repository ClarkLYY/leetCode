package leetcode.offer.math;

/**
 * int[] a = [1,2,3,4,5]
 * 不用除法，计算除当前i坐标外，其他所有值的乘积，作为result[i]
 *
 */
public class Solution66 {
    public int[] constructArr(int[] a) {
        int[] result = new int[a.length];
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        if(a.length==0) return result;
        left[0]=1;
        for(int i=0;i<a.length-1;i++){
            left[i+1] = left[i]*a[i];
        }
        right[a.length-1]=1;
        for(int i=a.length-1;i>0;i--){
            right[i-1] = right[i]*a[i];
        }
        for(int i=0;i<a.length;i++){
            result[i] = left[i]*right[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution66 s = new Solution66();
        s.constructArr(new int[]{1,2,3,4,5});
    }
}
