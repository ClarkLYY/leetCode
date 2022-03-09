package test;

/**
 * 用户账单逾期扣分
 * 详细描述
 * 给定一个字符串来表示一个用户的账单逾期记录，这个记录仅包含以下两个字符：
 *
 * 'N': 没有逾期，正常
 *
 * 'Y'：有逾期
 *
 * 如“YNN”表示用户逾期一次，“NNN”表示用户没有逾期，“NNYYYYYNNYY”表示用户最大连续逾期5次；
 *
 * 用户逾期扣分规则如下：
 *
 *  0< 最大连续逾期 <= 3	 3 < 最大连续逾期 <= 7	7 < 最大连续逾期
 *      -10	                    -15	                -25
 * 请根据用户逾期纪录计算返回用户最终逾期扣分数
 */
public class Solution2 {
    public int calDPDScore(String dpdInfo) {
        // write code here
        int maxY=0;
        int left=0;
        int right=0;
        for(int i=0;i<dpdInfo.length();i++){
            if (dpdInfo.charAt(i) == 'Y') {
                right++;
                maxY = Math.max(maxY, right-left);
            }else{
                left=i;
                right=i;
            }
        }
        if(0<maxY&&maxY<=3) return -10;
        if(3<maxY&&maxY<=7) return -15;
        if(7<maxY) return -10;

        return 0;
    }
}
