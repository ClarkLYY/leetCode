package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成有效括号的所有组合，递归回溯全排列
 */
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        backtrack(result, sb, 0,0,n);
        return result;
    }

    private void backtrack(List<String> result, StringBuffer sb, int l, int r, int n) {
        if(l==n&&r==n){
            result.add(sb.toString());
        }else{
            if(l<n){
                sb.append("(");
                backtrack(result, sb, l+1,r,n);
                sb.deleteCharAt(sb.length()-1);
            }
            if(r<l){
                sb.append(")");
                backtrack(result, sb, l,r+1,n);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
