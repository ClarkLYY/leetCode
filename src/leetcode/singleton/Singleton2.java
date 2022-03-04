package leetcode.singleton;

/**
 * 饿汉式
 */
public class Singleton2 {
    private static Singleton2 singleton = new Singleton2();
    public static synchronized Singleton2 get(){
        return singleton;
    }
}
