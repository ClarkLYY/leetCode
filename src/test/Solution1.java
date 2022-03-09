package test;

import java.util.*;


/**
 * 给定两个数字 (x, y)，允许以下两种计算：
 *
 * 1.同时对两个数加1， 即 (x, y) -> (x+1, y+1)
 *
 * 2.同时对两个数乘2，即 (x, y) -> (x*2, y*2)
 *
 * 求要将 (x, y) 转换成 (X,Y)，至少需要多次计算，如果不能转换，返回-1
 */
public class Solution1 {

    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     *
     *
     * 将 sourceX, sourceY 转换成 targetX, targetY 最少需要多少次计算
     * @param sourceX long长整型  x初始值
     * @param sourceY long长整型  y初始值
     * @param targetX long长整型  x目标值
     * @param targetY long长整型  y目标值
     * @return long长整型
     */
    public long GetMinCalculateCount(long sourceX, long sourceY, long targetX, long targetY) {
        // write code here
        if(sourceX>targetX||sourceY>targetY) return -1;
        int n=0;
        int add=0;
        while(2*sourceX<targetX){
            sourceX = sourceX *2;
            n++;
        }
        long last = targetX-sourceX;
        long last2 = last;
        for(int count=n;count>=0;count--){
            int x = toAdd(count);
            while(last-x>=0){
                last = last-x;
                add++;
            }
            if(last==0)break;
        }
        return isTrue(sourceY,targetY,n,last2) ? n+add : -1;
    }

    private int toAdd(int count) {
        int result=1;
        for(;count>0;count--){
            result = 2*result;
        }
        return result;
    }

    private boolean isTrue(long sourceY, long targetY, int n, long last){
        while(n>0){
            sourceY *=2;
            n--;
        }
        sourceY+=last;
        return sourceY==targetY;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        s.GetMinCalculateCount(30,30,64,64);
    }
}
