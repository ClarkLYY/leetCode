package leetcode.hot100;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 滑动窗口的最大值，双端队列
 */
public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);
            while(deque.peekFirst()<i-k+1){
                deque.pollFirst();
            }
            if(i-k+1>=0){
                result[i-k+1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
