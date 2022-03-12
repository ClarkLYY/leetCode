package leetcode.offer;

/**
 * 二维数组右下角的最大路径值
 * 动态规划
 */
public class Solution47 {
    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0&&j==0)continue;
                if(i==0){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }
                else if(j==0){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1])+grid[i][j];
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
