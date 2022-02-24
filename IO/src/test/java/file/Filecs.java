package file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/12/10 12:07
 */
public class Filecs {

    @Test
    public void test1() throws IOException {
        File file = new File("world.txt");//相对于module的路径 :文件生成在D:\IntelliJ IDEA 2020.1\JavaSE\IO\下
        File file2 = new File("texts\\hello.txt");//相对路径,文件生成在D:\IntelliJ IDEA 2020.1\JavaSE\IO\texts\下
        File file1 = new File("D:\\IntelliJ IDEA 2020.1\\JavaSE\\IO\\src\\test\\absolut.txt");//absolut.txt在D:\IntelliJ IDEA 2020.1\JavaSE\IO\src\test下
        System.out.println(file);//输出结果:hello.txt
        System.out.println(file1);//输出结果:D:\IntelliJ IDEA 2020.1\JavaSE\IO\src\test\hello.txt
        System.out.println(file.isDirectory());//判断是否为文件目录
        System.out.println(file.isFile());//判断是否为文件
        System.out.println(file.exists());//判断文件是否存在
        System.out.println(file.canRead());//判断文件是否可读
        System.out.println(file.canWrite());//判断文件是否可写
        System.out.println(file.isHidden());//判断文件是否隐藏
        System.out.println("=----------=");
        file.createNewFile();//若存在返回false,若不存在则帮忙创建、
        file1.createNewFile();//若存在返回false,若不存在则帮忙创建、
        file2.createNewFile();//若存在返回false,若不存在则帮忙创建
        File file3 = new File("directory");
        file3.mkdir();//创建文件目录，若存在返回false,若不存在,则帮忙创建,文件目录位置在D:\IntelliJ IDEA 2020.1\JavaSE\IO\下
        File file4 = new File("lokes//directory");
        file4.mkdirs();//创建文件目录,如果上层目录不存在一并创建
    }

}
