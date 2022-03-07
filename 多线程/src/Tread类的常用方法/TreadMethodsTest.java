package Tread类的常用方法;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/3 16:01
 */
public class TreadMethodsTest extends Thread{
    @Override
    public void run() {
        for(int i=0;i<30;i++){
              //currentThread():静态方法,返回执行当前代码的线程
              //getName():获取当前线程的名字
                System.out.println(this.currentThread().getName());
            if(i%2==0){
                //setName():设置当前线程的名字
                this.currentThread().setName("偶数线程"+i);
                //sleep(Long xx):设置当前线程进行阻塞状况的时间,单位毫秒
                try {
                    this.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(i%2!=0){
                this.currentThread().setName("奇数线程"+i);
            }
            if(i%3==0){
                //yield():释放当前线程CPU的执行权
                this.yield();
            }
            if(i==25){
                //stop():强制当前线程结束,已过时
                this.stop();
            }
        }
    }

    @Test
    public void test() throws InterruptedException {
        TreadMethodsTest treadMethodsTest = new TreadMethodsTest();
        //setName():设置当前线程的名字
        treadMethodsTest.setName("测试类中的线程");
        //start():作用:1.启动当前线程,2.调用当前线程的run()
        treadMethodsTest.start();
        for(int i=0;i<30;i++){
            if(i>20){
                try {
                    //join():在线程a中调用线程b的join(),此时线程a进入阻塞状态，
                    // 直到线程b完全执行完后,线程a才会结束阻塞状态
                    treadMethodsTest.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //给主线程命名
                Thread.currentThread().setName("主线程");
            }
            System.out.println(currentThread().getName()+i);
        }
        //isAlive():判断当前线程是否存活
        System.out.println(  treadMethodsTest.isAlive());
    }
}
