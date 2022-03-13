package leetcode.offer.string;

/**
 * 左旋转字符串，abcdef,n=2，即将cdfe提前，返回cdefab
 * 直接substring，或者遍历字符串拼接
 */
public class Solution58_2 {
    public String reverseLeftWords(String s, int n) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(i<n){
                sb1.append(s.charAt(i));
            }else{
                sb2.append(s.charAt(i));
            }
        }
        sb2.append(sb1);
        return sb2.toString();
    }
}
