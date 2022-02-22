package leetcode.hot100;

import static java.lang.System.currentTimeMillis;

public class Test {
    public static long test(long n){
        if(n==1) return 1;
        return n*test(n-1);
    }

    public static void main(String[] args) {
        long start =  System.currentTimeMillis();
        System.out.println(test(20));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
