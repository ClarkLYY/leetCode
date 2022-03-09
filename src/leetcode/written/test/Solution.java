package leetcode.written.test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        int count = in.nextInt();
        for(int i=0;i<count;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            int k=in.nextInt();
            int result = findCount(l,r,k,nums);
            System.out.println(result);
        }
    }

    private static int findCount(int l, int r, int k, int[] nums) {
        int result = 0;
        for(int i=l-1;i<r;i++){
            if(nums[i]==k) result++;
        }
        return result;
    }
}
