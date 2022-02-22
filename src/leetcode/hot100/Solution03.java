package leetcode.hot100;

import java.util.HashSet;

/**
 * 最长无重复子串，滑动窗口
 */
public class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0, right=0, max=0;
        while(right<s.length()){
            char rightChar = s.charAt(right);
            right++;
            while(set.contains(rightChar)){
                char leftChar = s.charAt(left);
                left++;
                set.remove(leftChar);
            }
            set.add(rightChar);
            if(set.size()>max) max=set.size();
        }
        return max;
    }
}
