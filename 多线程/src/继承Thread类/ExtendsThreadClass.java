package 继承Thread类;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/3 15:36
 */
//多线程的创建:方式一:继承于Thread类
//1.创建一个继承于Thread类的子类
//2.重写Thread类的run(),将此线程执行的操作声明在run()中
//3.创建Thread类的子类的对象
//4.通过此对象调用start();

     //1.创建一个继承于Thread类的子类
public class ExtendsThreadClass extends Thread{

    @Test
    public void test(){
        //3.创建Thread类的子类的对象
        ExtendsThreadClass t1 = new ExtendsThreadClass();

        //4.通过此对象调用start();
        //start():作用:1.启动当前线程,2.调用当前线程的run()
        t1.start();

        //如下操作仍是在main线程中执行的
        //遍历100以内的奇数
        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(i+"***main***");
            }
        }
    }

    //2.重写Thread类的run(),将此线程执行的操作声明在run()中
    @Override
    public void run() {
        //遍历100以内的偶数
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
