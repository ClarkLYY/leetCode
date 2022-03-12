package leetcode.offer;

/**
 * 返回01234567891011...序列的第n个数
 * 1. 寻找在哪个区间，还有当前num的位数
 * 2. 寻找是哪个num
 * 3. 寻找是num的哪个下标
 */
public class Solution44 {
    public int findNthDigit(int n) {
        if(n<=9){
            return n;
        }
        long count =10;
        int digit=1;
        long start=1;
        while(n>count){
            n -= count;
            digit++;
            start*=10;
            count = start*digit*9;
        }
        long num = start + n/digit;
        int index = n%digit;
        return String.valueOf(num).charAt(index)-'0';
    }
}
