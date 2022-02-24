package readerandwrite;

import org.junit.Test;

import java.io.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/12/10 15:32
 */
public class FileReaderWrite {

    //将hello.txt读入程序中并输出控制台
    //为了保证流资源一定可以执行关闭操作，需要使用try-catch-finally
    //读入的文件一定要存在,否则会报FileNotFoundException
    @Test
    public void testFileReader(){
        File file=null;
        FileReader fileReader=null;
        try {
           //1.实例化File类的对象,并指明要操作的文件
          file = new File("texts//hello.txt");
           //2.提供具体的流
          fileReader = new FileReader(file);
           //3.数据的读入
           //char():返回读入的一个字符.如果达到文件末尾，则返回-1
           int read = fileReader.read();
           while(read!=-1){
               System.out.println((char) read);
               read=fileReader.read();
           }
       }catch (IOException e){
           e.printStackTrace();
       }finally {
            if (fileReader!=null){
                try {
                    //4.流的关闭操作
                    fileReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
       }

    }

    //对read()操作升级:使用read的重载方法
    @Test
    public void fielread(){
        File file=null;
        FileReader fileReader=null;
        try{
            file = new File("texts//hello.txt");
            fileReader = new FileReader(file);

            //读入的操作
            char[] cbuf= new char[5];
            //每次读入cbuf数组中的字符的个数，若读到末尾。则返回-1
            int len=fileReader.read(cbuf);//返回值为读入的字符个数，读到末尾返回-1

            //方式一:
//            while((len=fileReader.read(cbuf))!=-1){
//                for(int i=0;i<len;i++) {
//                    System.out.println(cbuf[i]);
//                }
//            }

            //方式二:
            while((len=fileReader.read(cbuf))!=-1){
                //参数一为读入的数据，参数二为从哪个位置开始读,0为从头开始读,参数三为读入的个数
                String str=new String(cbuf,0,len);
                System.out.println(str);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                try {
                    //4.流的关闭操作
                    fileReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void filewrite(){
        File file=null;
        FileWriter filewrite =null;
      try {
          //1.提供File类的对象,指明写出到的文件
          file = new File("texts//popo.txt");
          //2.提供FileWriter的对象,用于数据的写出
          filewrite = new FileWriter(file);

          //3.写出的操作,若写出的文件不存在,则会自动创建
          //若存在此文件，且有内容，以下操作会覆盖文件内容
          //若想文件不被覆盖,则使用FileWriter(file，true)
          //默认为FileWriter(file，false),也就是FileWriter(file),会对文本进行覆盖
          filewrite.write("I'm not an ordinary person");

      }catch (IOException e){
          e.printStackTrace();
      }finally {
          if (filewrite!=null){
              try {
                  //4.流的关闭操作
                  filewrite.close();
              }catch (IOException e){
                  e.printStackTrace();
              }
          }
      }
    }
}
