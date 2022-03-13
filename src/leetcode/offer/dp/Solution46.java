package leetcode.offer.dp;

/**
 * 将数字转成字符串，返回可以返回的次数
 * 12258
 * 可以有五种
 * dfs或者动态规划（青蛙跳台阶）
 */
public class Solution46 {
    int ans=0;
    public int translateNum(int num) {
        String str = String.valueOf(num);
        dfs(str,0);
        return ans;
    }

    void dfs(String str, int i){
        if(i==str.length()-1){
            ans++;
            return;
        }
        dfs(str, i+1);

        if(i<str.length()-1){
            int num = (str.charAt(i)-'0') *10 + (str.charAt(i+1)-'0');
            if(num<=25){
                dfs(str, i+2);
            }
        }
    }

    public static void main(String[] args) {
        Solution46 s = new Solution46();
        s.translateNum(25);
    }
}
