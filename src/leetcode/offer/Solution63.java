package leetcode.offer;

/**
 * 股票一次交易最大收益
 * 动态规划dp[i] = Math.max(dp[i-1], prices[i]-min)
 * 如果是这次卖，就prices[i]-min，否则就是之前的状态
 */
public class Solution63 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        if(prices.length==0)return 0;
        dp[0]=0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            min = Math.min(min, prices[i]);
            dp[i] = Math.max(dp[i-1], prices[i]-min);
        }
        return dp[prices.length-1];
    }
}
