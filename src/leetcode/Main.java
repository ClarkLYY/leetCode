package leetcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        while(k-->0){
            String s = sc.nextLine();
            System.out.println(findCount(s));
        }
    }

    private static int findCount(String s) {

        int[][] dp = new int[2][s.length()];
        for(int i=0;i<2;i++){
            for(int j=0;j<s.length();j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        if(isUp(s.charAt(1))){
            dp[0][0] = 2;
            dp[1][0] = 2;
        }else{
            dp[0][0] = 1;
            dp[1][0] = 2;
        }
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(isUp(c)){
                dp[1][i] = Math.min(dp[0][i-1]+2, dp[1][i-1]+1);
                dp[0][i] = Math.min(dp[0][i-1]+2, dp[1][i-1]+2);
            }else{
                dp[1][i] = Math.min(dp[0][i-1]+2, dp[1][i-1]+2);
                dp[0][i] = Math.min(dp[0][i-1]+1, dp[1][i-1]+2);
            }
        }
        return Math.min(dp[0][s.length()-1], dp[1][s.length()-1]);

    }

    private static boolean isUp(char c){
        return c >= 'A' && c <= 'Z';
    }
}


