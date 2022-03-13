package leetcode.offer.math;

/**
 * x的n次方，数学减少循环次数
 */
public class Solution16 {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        if(x==1 || n==0) return 1.0;
        double res=1;
        if(n>0) {
            while (n!=0) {
                //当n是2的倍数时，可以将底数平方，n/2减少循环次数
                if(n%2==0) {
                    x*=x;
                    n=n/2;
                }
                res*=x;
                n--;
            }
        }else {
            while (n!=0) {
                if(n%2==0) {
                    x*=x;
                    n=n/2;
                }
                res/=x;
                n++;
            }
        }

        return res;
    }
}
