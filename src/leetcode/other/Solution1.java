package leetcode.other;

import java.util.Scanner;

/**
 * 01字符串，只能1改成0，要求子串不能出现101，求最小次数
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        char[] nums = s.toCharArray();
        int result=0;
        for(int i=2;i<s.length();i++){
            if(nums[i-2]=='1'&&nums[i-1]=='0'&&nums[i]=='1'){
                result++;
                nums[i]='0';
            }
        }
        System.out.print("修改后：");
        for (char n:nums){
            System.out.print(n);
        }
        System.out.println("");
        System.out.println(result);
    }
}
