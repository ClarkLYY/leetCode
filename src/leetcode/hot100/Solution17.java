package leetcode.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 电话号码所有可能性，全排列，递归回溯
 */
public class Solution17 {
    static Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.equals("")) return result;
        StringBuffer sb = new StringBuffer();
        backtrack(result, sb, 0, digits);
        return result;
    }

    private void backtrack(List<String> result, StringBuffer sb, int index, String digits) {
        if(sb.length()==digits.length()){
            result.add(sb.toString());
        }else{
            char[] chars = phoneMap.get(digits.charAt(index)).toCharArray();
            for(char c :chars){
                sb.append(c);
                backtrack(result, sb, index+1, digits);
                sb.deleteCharAt(index);
            }
        }
    }
}
