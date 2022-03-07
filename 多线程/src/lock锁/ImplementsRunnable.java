package lock锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/5 14:46
 */
public class ImplementsRunnable implements Runnable{

    //此时typice不用声明为static,因为三个Thread共用一个ImplementsRunnable对象
    private int typice=100;
    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            //2.调用锁定方法lock();
            lock.lock();
            if(typice>0){
                System.out.println(Thread.currentThread().getName()+"----"+typice);
                typice--;
            }else {
                break;
            }
            //3.调用解锁方法：unlock()
            lock.unlock();
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
