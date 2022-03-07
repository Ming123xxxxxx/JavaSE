package 常见的异常举例.编译时异常;

import java.io.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/7 15:10
 */
public class FileNotFoundExceptionTest {

    //文件未找到异常  FileNotFoundException
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(new File("xx")));
        reader.close();
    }
}
