package leetcode.offer.math;

/**
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 返回1+2+...+n
 * 使用if(A && B)里的断路方式，当A==false，B就不判断了，将这个B换成递归执行的下次方法
 */
public class Solution64 {
    public int sumNums(int n) {
        boolean x= n>1 && (n=n+sumNums(n-1))>0;
        return n;
    }
}
