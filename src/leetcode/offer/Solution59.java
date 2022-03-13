package leetcode.offer;

import java.util.LinkedList;

/**
 * 滑动窗口的最大值，使用双端队列记录滑动窗口内的最大值，实现非严格递减
 * 每次窗口向右滑动时，如果移除的元素，恰好是双端队列队首（最大值），双端队列的队首也要移除
 * 加入队尾的元素为num，要把队列中所有小于num的元素移除，实现非严格递减
 */
public class Solution59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        if(nums.length==0) return new int[0];
        int[] result = new int[nums.length-k+1];
        int i=0;
        while(i<=nums.length-1){
            //每次先保证双端队列单调递减
            while(!list.isEmpty() && nums[i]>list.peekLast()){
                list.pollLast();
            }
            //未形成窗口，continue
            list.addLast(nums[i]);
            if(i<k-1){
                i++;
                continue;
            }
            //如果形成窗口，将队列队首最大值放入
            result[i-k+1] = list.peekFirst();
            //移动窗口前，如果去掉的是最大值，队首也去掉
            if(nums[i-k+1]==list.peekFirst()){
                list.pollFirst();
            }
            //移动窗口
            i++;
        }
        return result;
    }
}
