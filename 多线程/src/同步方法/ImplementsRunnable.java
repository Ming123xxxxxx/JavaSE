package 同步方法;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/5 14:46
 */
public class ImplementsRunnable implements Runnable{
    //此时typice不用声明为static,因为三个Thread共用一个ImplementsRunnable对象
    private int typice=100;

    @Override
    public void run() {
             while (typice>0){
                 show();
             }
    }
    public synchronized void show(){//此时的同步监视器为this,且标注synchronized的方法为单线程执行
            if (typice > 0) {
                System.out.println(Thread.currentThread().getName() + "----" + typice);
                typice--;
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
