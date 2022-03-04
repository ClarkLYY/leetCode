package leetcode.singleton;

/**
 * 双重校验锁
 */
public class Singleton3 {
    private static Singleton3 singleton;
    public static Singleton3 get(){
        if(singleton==null){
            synchronized (Singleton3.class){
                if(singleton==null){
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
