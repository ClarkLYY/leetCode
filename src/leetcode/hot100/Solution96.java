package leetcode.hot100;

/**
 * 返回1~n不同二叉搜索树的个数
 * 动态规划
 * 1~n中，假如我们以j为root，左子树就是j-1的所有二叉搜索树，右子树就是n-j
 * 左右子树我们再以上述方式进行递归
 * 可得dp[n] = dp[j-1]*dp[n-j]的累加 1<=j<=n
 */
public class Solution96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
