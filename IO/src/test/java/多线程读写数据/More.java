package 多线程读写数据;

import org.junit.Test;

import java.io.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/5 14:54
 */
public class More implements Runnable{


    public static void main(String[] args) {

        Long morethreads=0L;
        Long onethread=0L;

        for(int i =0;i<1000;i++){
            if(i%2==0){
                morethreads=morethreads+morethread();
            }
            if(i%2!=0){
                onethread=onethread+test();
            }
            new File("D:\\IntelliJ IDEA 2020.1\\JavaSE\\IO\\texts\\赤壁赋.txt").delete();
        }

        System.out.println("多线程花费时间:"+morethreads);
        System.out.println("单线程花费时间:"+onethread);

    }

    public static Long morethread(){
        Long i = System.currentTimeMillis();
        More more = new More();
        Thread thread = new Thread(more);
        Thread thread1 = new Thread(more);
        Thread thread2 = new Thread(more);
        Thread thread3 = new Thread(more);
        Thread thread4 = new Thread(more);
        Thread thread5 = new Thread(more);
        Thread thread6 = new Thread(more);
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        return System.currentTimeMillis()-i;
    }

    public void run() {
        InputStreamReader inputStreamReader=null;
        OutputStreamWriter outputStreamWriter= null;
        try {
            FileInputStream fis = new FileInputStream("D:\\IntelliJ IDEA 2020.1\\JavaSE\\IO\\texts\\xxx.txt");
            FileOutputStream fos = new FileOutputStream(new File("D:\\IntelliJ IDEA 2020.1\\JavaSE\\IO\\texts\\赤壁赋.txt"));
            inputStreamReader = new InputStreamReader(fis,"UTF-8");
            outputStreamWriter = new OutputStreamWriter(fos,"UTF-8");

            char[] cbuf = new char[100];
            int len;
            while((len=inputStreamReader.read(cbuf))!=-1){
                outputStreamWriter.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputStreamReader!=null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStreamWriter!=null){
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static  Long test(){
        Long i = System.currentTimeMillis();
        InputStreamReader inputStreamReader=null;
        OutputStreamWriter outputStreamWriter= null;
        try {
            FileInputStream fis = new FileInputStream("D:\\IntelliJ IDEA 2020.1\\JavaSE\\IO\\texts\\xxx.txt");
            FileOutputStream fos = new FileOutputStream(new File("D:\\IntelliJ IDEA 2020.1\\JavaSE\\IO\\texts\\赤壁赋.txt"));
            inputStreamReader = new InputStreamReader(fis,"UTF-8");
            outputStreamWriter = new OutputStreamWriter(fos,"UTF-8");

            char[] cbuf = new char[100];
            int len;
            while((len=inputStreamReader.read(cbuf))!=-1){
                outputStreamWriter.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputStreamReader!=null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStreamWriter!=null){
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return System.currentTimeMillis()-i;
    }

}
