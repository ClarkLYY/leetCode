package leetcode.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
    static List<List<Integer>> result = new LinkedList<>();
    static List<Integer> list = new LinkedList<>();
    static int sum=0;
    static int target=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        target = n;
        in.nextLine();
        String[] strings = in.nextLine().split(",");
        int[] nums = new int[strings.length];
        for(int i=0;i<nums.length;i++){
            nums[i] = Integer.parseInt(strings[i]);
        }
        List<Integer> list = new ArrayList<>();
        backtrace(0,nums);
        for(List<Integer> l:result){
            System.out.println(l);
        }

    }


    private static void backtrace(int i, int[] nums) {
        if(i==nums.length){
            if(sum==target)
            result.add(new LinkedList<>(list));
            return;
        }
        int value = nums[i];
        list.add(value);
        sum+=value;
        backtrace(i+1, nums);
        list.remove(list.size()-1);
        sum-=value;
        backtrace( i+1,nums);
    }

}
