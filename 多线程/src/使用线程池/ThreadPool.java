package 使用线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/6 16:18
 */
public class ThreadPool {
    public static void main(String[] args) {
        //1.创建线程池,设置线程数量为10个
        ExecutorService service = Executors.newFixedThreadPool(10);
        //将ExecutorService对象转化为ThreadPoolExecutor对象,并设置线程池的属性
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池的大小
        service1.setCorePoolSize(15);
        //service1.setKeepAliveTime();   //	线程最大空闲时间
        //2.执行指定线程的操作,需要提供实现Runnbale接口(使用execute()时)或Callable接口(使用submit()时)的对象
        service.execute(new NumberThread());//适用于Runnable
        service.execute(new NumberThread1());
        //service.submit()//适用于Callable
        //3.线程池的关闭
        service.shutdown();
    }
}

class NumberThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"----"+i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"----"+i);
            }
        }
    }
}