package leetcode.offer;

/**
 * 不用+-/*计算两个数的和
 */
public class Solution65 {
    public int add(int a, int b) {
        //将a+b转换成n+c，不断循环，直到c==0;
        while(b!=0){
            //与运算算进位，然后要左移一位
            int c = (a&b)<<1;
            //或运算算当前位的值，即无符号运算
            a = a^b;
            b=c;
        }
        return a;
    }
}
