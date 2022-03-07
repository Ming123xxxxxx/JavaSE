package 懒汉式;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/6 14:13
 */

//使用同步机制将单例模式中的懒汉式改写为线程安全的
public class LazyStyle {

}


class Bank {

    private Bank(){

    }

    private static Bank instance =null;

    public Bank getInstance(){

        if(instance==null){
            synchronized (Class.class){
                if(instance==null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}
