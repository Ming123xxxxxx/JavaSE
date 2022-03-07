package 同步方法;

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

    //若通过继承Thread时
    //synchronized定义的方法必须为static,否则同步锁为this,定义为static后,同步监视器为"当前类.class"
    public static synchronized void show(){
        if(typice>0){
            System.out.println(Thread.currentThread().getName()+"----"+typice);
            typice--;
        }
    }

    @Override
    public void run() {
        while (typice>0){
            show();
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
