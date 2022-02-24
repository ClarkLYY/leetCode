package leetcode.hot100;

import java.util.Stack;

/**
 * 最长有效括号子串长度
 */
public class Solution32 {
//    public int longestValidParentheses(String s) {
//        Stack<Integer> stack = new Stack<>();
//        int max=0;
//        stack.push(-1);
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='('){
//                stack.push(i);
//            }else if(s.charAt(i)==')'){
//                stack.pop();
//                if(stack.isEmpty()){
//                    stack.push(i);
//                }else{
//                    max = Math.max(max, i-stack.peek());
//                }
//            }
//        }
//        return max;
//    }

    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int max=0;
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                if(s.charAt(i-1)=='('){
                    if(i>=2){
                        dp[i] = dp[i-2]+2;
                    }else{
                        dp[i] = 2;
                    }
                }else if(i-dp[i-1]>0 && s.charAt(i-dp[i-1]-1)=='('){
                    if(i-dp[i-1]>=2){
                        dp[i] = dp[i-1] + dp[i- dp[i-1]-2]+2;
                    }else{
                        dp[i] = dp[i-1] + 2;
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
