package inputoutputstream;

import org.junit.Test;

import java.io.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/12/11 12:05
 */
public class InputOutputStream {

    @Test
    public void inputstreamreader(){
        //InputStreamReader的使用,实现字节的输入流到字符的输入流的转换
        InputStreamReader streamReader=null;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("texts//hello.txt"));
            //参数二:指明了字符集,具体使用那个字符集,取决于当初文件保存的字符集
            //若不添加第二个参数,则使用系统默认的字符集去读
//            streamReader = new InputStreamReader(fileInputStream);
            streamReader = new InputStreamReader(fileInputStream,"UTF-8");

            char[] cbuf = new char[20];
            int len;
            while((len=streamReader.read(cbuf))!=-1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(streamReader!=null){
                try {
                    streamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //将以UTF-8保存的文件hello.txt以UTF-8读入。并以GBK格式写出到hello_gbk.txt中
    @Test
    public void inputandoutputstream(){

        InputStreamReader inputStreamReader=null;
        OutputStreamWriter outputStreamWriter= null;
        try {
            FileInputStream fis = new FileInputStream(new File("texts//hello.txt"));
            FileOutputStream fos = new FileOutputStream(new File("texts//hello_gbk.txt"));
            inputStreamReader = new InputStreamReader(fis,"UTF-8");
            outputStreamWriter = new OutputStreamWriter(fos,"GBK");

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
}
