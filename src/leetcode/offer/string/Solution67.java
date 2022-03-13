package leetcode.offer.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串转int，使用自动机
 */
public class Solution67 {
    public int strToInt(String str) {
        Map<State, Map<CharType,State>> transfer = new HashMap<>();
        //初始化状态下的状态流转
        Map<CharType, State> initMap = new HashMap<CharType, State>(){{
            put(CharType.NUMBER, State.NUMBER);
            put(CharType.SIGN, State.SIGN);
            put(CharType.SPACE, State.INIT);
        }};
        transfer.put(State.INIT,initMap);
        //sign状态下的状态流转
        Map<CharType, State> signMap = new HashMap<CharType, State>(){{
            put(CharType.NUMBER, State.NUMBER);
        }};
        transfer.put(State.SIGN,signMap);
        //number状态下的状态流转
        Map<CharType, State> numberMap = new HashMap<CharType, State>(){{
            put(CharType.NUMBER, State.NUMBER);
            put(CharType.SPACE, State.END);
        }};
        transfer.put(State.NUMBER,numberMap);

        int sign = 1;
        long ans = 0;
        State state = State.INIT;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            CharType type = getCharType(c);
            if(transfer.get(state)==null||!transfer.get(state).containsKey(type)){
                break;
            }
            if(type==CharType.SIGN){
                sign = c == '+' ? 1 : -1;
            }
            if(type==CharType.NUMBER){
                ans = ans*10 + c-'0';
                ans = sign == 1 ? Math.min(ans, Integer.MAX_VALUE) : -Math.max(-ans, Integer.MIN_VALUE);
            }
            state = transfer.get(state).get(type);
        }
        return (int) (ans*sign);
    }

    private CharType getCharType(char c){
        if(Character.isDigit(c)){
            return CharType.NUMBER;
        }
        if(c=='-'||c=='+'){
            return CharType.SIGN;
        }
        if(c==' '){
            return CharType.SPACE;
        }
        return CharType.ILLEGAL;
    }

    enum CharType{
        SIGN,
        NUMBER,
        SPACE,
        ILLEGAL
    }
    enum State{
        INIT,
        SIGN,
        NUMBER,
        END
    }
}
