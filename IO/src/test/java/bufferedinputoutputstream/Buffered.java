package bufferedinputoutputstream;

import org.junit.Test;

import java.io.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/12/11 10:43
 */
public class Buffered {

    @Test
    public void bufferedstream(){
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        //1.造文件
        try {
             File file = new File("texts//download.jpg");
             File destfile= new File("texts//环境.jpg");
            //2.造流
             fileInputStream = new FileInputStream(file);
             fileOutputStream = new FileOutputStream(destfile);
            //3.造缓冲流
             bufferedInputStream = new BufferedInputStream(fileInputStream);
             bufferedOutputStream= new BufferedOutputStream(fileOutputStream);

            //4.复制的细节:读取。写入
            byte[] buf= new byte[10];
            int len;
            while((len=bufferedInputStream.read(buf))!=-1){
                bufferedOutputStream.write(buf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.资源关闭:先关外层的流，再关内层的流
            //说明:关闭外层流的同时，内层流也会自动关闭，所以关闭了外层流就不用手动关闭内层流了
            if(bufferedInputStream!=null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedOutputStream!=null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void bufferedreaderwriter(){
        BufferedReader bufferedReader =null;
        BufferedWriter bufferedWriter=null;
        try {
             bufferedReader = new BufferedReader(new FileReader(new File("texts//hello.txt")));
             bufferedWriter = new BufferedWriter(new FileWriter(new File("texts//java.txt")));

             //读写操作
            //方式一:使用char[]数组
//            char[] cbuf = new char[1024];
//            int len;
//            while((len=bufferedReader.read(cbuf))!=-1){
//                bufferedWriter.write(cbuf,0,len);
//            }

            //方式二:使用String
            String data;
            while((data=bufferedReader.readLine())!=null){
                //方式一:
//                 bufferedWriter.write(data+"\n");//data中不包含换行符,通过”\n“可以使文本换行
                //方式二:
                   bufferedWriter.write(data);
                   bufferedWriter.newLine();//newLine():提供换行的操作
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
