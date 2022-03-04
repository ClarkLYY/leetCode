package leetcode.singleton;

/**
 * 懒汉式
 */
public class Singleton1 {
    private static Singleton1 singleton;
    public synchronized static Singleton1 get(){
        if(singleton==null){
            singleton = new Singleton1();
        }
        return singleton;
    }
}
