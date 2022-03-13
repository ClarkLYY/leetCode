package leetcode.offer.heap;

import java.util.PriorityQueue;

/**
 * 寻找最小的k个数，大根堆
 */
public class Solution40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0) return new int[0];
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2)-> o2-o1);
        for(int num:arr){
            if(heap.size()<k){
                heap.offer(num);
            }else{
                if(num>=heap.peek())continue;
                heap.poll();
                heap.offer(num);
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = heap.poll();
        }
        return ans;
    }
}
