package 多窗口卖票;

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

    @Override
    public void run() {
       while (true){
           if(typice>0){
               System.out.println(Thread.currentThread().getName()+"----"+typice);
               typice--;
           }else{
               break;
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
