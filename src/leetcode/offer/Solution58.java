package leetcode.offer;

/**
 * 翻转单词顺序
 * 使用双指针框定单词范围，然后从后往前遍历，注意trim()消除前后空格
 */
public class Solution58 {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuffer sb = new StringBuffer();
        int i=s.length()-1;
        int j=i;
        while(i>=0){
            while(i>=0&&s.charAt(i)!=' '){
                i--;
            }
            sb.append(s.substring(i+1,j+1)+" ");
            while(i>=0&&s.charAt(i)==' '){
                i--;
            }
            j=i;
        }
        return sb.toString().trim();
    }
}
