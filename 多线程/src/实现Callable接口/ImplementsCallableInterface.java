package 实现Callable接口;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/6 15:40
 */
//创建线程的方式三:实现Callable接口
    //1.实现Callable接口；
public class ImplementsCallableInterface implements Callable {

    //2.重写call(),将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int i;
        for(i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"----"+i);
            }
        }
        return i;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3.获取继承了Callable接口的类的对象
        ImplementsCallableInterface ints = new ImplementsCallableInterface();
        //4.将继承了Callable接口的类的对象放入FutureTask的构造器中
        FutureTask task = new FutureTask(ints);
        //5.创建Thread对象并将FutureTask对象放入Tread对象中,并执行start()
        new Thread(task).start();
        //get():获取call()的返回值
        Object o = task.get();
        System.out.println(o);

        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"----"+i);
            }
        }
    }
}
