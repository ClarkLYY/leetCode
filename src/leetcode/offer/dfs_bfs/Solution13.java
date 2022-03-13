package leetcode.offer.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 机器人的活动范围，bfs/dfs
 */
public class Solution13 {
    public int movingCount(int m, int n, int k) {
        Queue<int[]> queue = new LinkedList<>();
        int result=1;
        int[] dx = new int[]{0,0,-1,1};
        int[] dy = new int[]{-1,1,0,0};
        int[][] vis = new int[m][n];
        vis[0][0]=1;
        queue.add(new int[]{0,0});
        while(!queue.isEmpty()){
            int[] index = queue.poll();
            int x = index[0];
            int y = index[1];
            for(int i=0;i<4;i++){
                int tx = dx[i]+x;
                int ty = dy[i]+y;
                if(tx<0||ty<0||tx>m-1||ty>n-1||vis[tx][ty]==1||getSum(tx)+getSum(ty)>k){
                    continue;
                }
                vis[tx][ty]=1;
                queue.add(new int[]{tx,ty});
                result++;
            }
        }
        return result;
    }

    private int getSum(int n) {
        int sum=0;
        while(n>0){
            sum += n % 10;
            n = n/10;
        }
        return sum;
    }
}
