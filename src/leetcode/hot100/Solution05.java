package leetcode.hot100;

/**
 * 最长回文字符串，中心扩展
 */
public class Solution05 {
    public String longestPalindrome(String s) {
        String max = "";
        if(s.length()==1){
            return s;
        }
        for(int i=0;i<s.length()-1;i++){
            String s1 = expendCenter(s,i,i);
            if(s1.length()>max.length()) max = s1;
            String s2 = expendCenter(s,i,i+1);
            if(s2.length()>max.length()) max = s2;
        }
        return max;
    }

    private String expendCenter(String s, int left, int right) {
        String result = "";
        while(left>=0&&right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                result = s.substring(left,right+1);
                left--;
                right++;
            }else{
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution05 solution05 = new Solution05();
        solution05.longestPalindrome("babab");
    }
}
