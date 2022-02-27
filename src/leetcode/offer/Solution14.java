package leetcode.offer;

/**
 * 剪绳子，动态规划
 */
public class Solution14 {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=2;j<i;j++){
                dp[i] = Math.max(dp[i], Math.max(j*(i-j), j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
