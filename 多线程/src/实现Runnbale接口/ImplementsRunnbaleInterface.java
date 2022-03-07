package 实现Runnbale接口;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/5 14:32
 */
//创建多线程的方式二:实现Runnable接口
//1.创建一哥实现Runnable接口的类
//2.实现类去实现Runnable接口中的抽象方法:run()
//3.创建实现类的对象
//4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的对象
//5.通过Thread类的对象调用start();
    //1.创建一哥实现Runnable接口的类
public class ImplementsRunnbaleInterface implements Runnable{

    //2.实现类去实现Runnable接口中的抽象方法:run()
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            //遍历100内的偶数
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"----"+i);
            }
        }
    }

    public static void main(String[] args) {
        //3.创建实现类的对象
        ImplementsRunnbaleInterface interfaces = new ImplementsRunnbaleInterface();
        //4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的对象
        Thread thread = new Thread(interfaces);
        //5.通过Thread类的对象调用start();
        thread.start();

        for (int i=0;i<100;i++){
            //遍历100内的奇数
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"----"+i);
            }
        }
    }

}
