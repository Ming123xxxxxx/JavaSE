package 同步代码块;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/5 14:21
 */

//创建三个窗口买票,总票数为100张
    //通过继承Thread方式
public class ExtendsThread extends Thread {

    //必须声明为static，使之成为共享数据
    private static int typice=100;

    //随意设置一个对象充当同步监视器;必须声明为static
    static Object obj = new Object();

    @Override
    public void run() {
       while (true){
           //此时同步监视器不可用this充当，此时的this代表着main()中的one,two,three
           //可设置为静态全局对象,如上面定义的obj,也可设置为"对象.class"
        synchronized (Class.class){
            if(typice>0){
                System.out.println(Thread.currentThread().getName()+"----"+typice);
                typice--;
            }else{
                break;
            }
        }
       }
    }

    public static void main(String[] args) {
        ExtendsThread one = new ExtendsThread();
        ExtendsThread two = new ExtendsThread();
        ExtendsThread three = new ExtendsThread();
        one.setName("窗口1");
        two.setName("窗口2");
        three.setName("窗口3");
        one.start();
        two.start();
        three.start();
    }

}
