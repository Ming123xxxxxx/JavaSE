package fileinputstremoutputstream;

import org.junit.Test;

import java.io.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/12/11 10:05
 */
public class InputOutputStream {

    @Test
    public void fileinputstream(){
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            File file = new File("texts//download.jpg");
            File destfile= new File("texts//风景.jpg");
             fileInputStream = new FileInputStream(file);
             fileOutputStream= new FileOutputStream(destfile);

            //将download.jpg复制给风景.jpg
            byte[] buf = new byte[5];
            int len;
            while((len=fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream!=null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
