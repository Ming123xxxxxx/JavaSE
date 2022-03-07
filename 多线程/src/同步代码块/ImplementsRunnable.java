package 同步代码块;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/5 14:46
 */
public class ImplementsRunnable implements Runnable{
    //此时typice不用声明为static,因为三个Thread共用一个ImplementsRunnable对象
    private int typice=100;
    //同步代码块:
    //    synchronized(同步监视器){
    //       //需要被同步的代码
    //    }
    //   说明:  1.操作共享数据的代码,即为需要被同步的代码,
    //        2.共享数据:被多个线程共同操作的变量,如此案例中的typice就是共享数据
    //        3.同步监视器:俗称,锁,任何一个类的对象,都可以充当锁,
    //         要求:多个线程必须要共用同一把锁
    private Object obj = new Object();
    @Override
    public void run() {
        while(true) {
            //此时的this为main()中创建的ImplementsRunnabled对象runnable
            //可设置为全局对象,如上面定义的obj,也可设置为"对象.class"
            synchronized (Class.class) {
                if (typice > 0) {
                    System.out.println(Thread.currentThread().getName() + "----" + typice);
                    typice--;
                } else {
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        ImplementsRunnable runnable = new ImplementsRunnable();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.setName("窗口1");
        thread1.setName("窗口2");
        thread2.setName("窗口3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
