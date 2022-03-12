package leetcode.offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 将数组组合成最小的数
 * [10, 2, 1]组合成1012最小
 * 数组内排序，如果[xy]>[yx]，说明是x的权重要小
 */
public class Solution45 {
    public String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (o1, o2)->{
            return (o1+o2).compareTo(o2+o1);
        });
        StringBuffer sb = new StringBuffer();
        for(String s:str){
            sb.append(s);
        }
        return sb.toString();
    }
}
