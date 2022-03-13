package leetcode.offer.stack;

import java.util.Stack;

/**
 * 最小栈min，用两个栈，一个正常的栈，一个最小栈
 */
public class Solution30 {
    private Stack<Integer> minStack;
    private Stack<Integer> stack;

    /** initialize your data structure here. */
    public Solution30() {
        this.minStack = new Stack<>();
        this.stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()||minStack.peek()>=x){
            minStack.push(x);
        }
    }

    public void pop() {
        if(minStack.peek().equals(stack.pop())){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
