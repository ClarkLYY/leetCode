package leetcode.offer.math;

/**
 * 约瑟夫环，数学推导
 * f(n,m) = (f(n-1, m)+m)%n
 */
public class Solution62 {
    public int lastRemaining(int n, int m) {
        int ans=0;
        for(int i=1;i<=n;i++){
            ans = (ans+m) % i;
        }
        return ans;
    }
}
