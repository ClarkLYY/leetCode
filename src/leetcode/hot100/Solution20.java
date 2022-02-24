package leetcode.hot100;

import java.util.Stack;
import java.util.Vector;

/**
 * 判断括号是否有效，栈
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(stack.isEmpty()||stack.pop()!='(') return false;
            }else if(s.charAt(i)=='}'){
                if(stack.isEmpty()||stack.pop()!='{') return false;
            }else if(s.charAt(i)==']'){
                if(stack.isEmpty()||stack.pop()!='[') return false;
            }
        }
        return stack.isEmpty();
    }
}
