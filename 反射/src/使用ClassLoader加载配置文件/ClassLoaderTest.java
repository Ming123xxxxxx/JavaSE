package 使用ClassLoader加载配置文件;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/18 16:29
 */
public class ClassLoaderTest {

    @Test
    public void test() throws IOException {
        Properties properties = new Properties();
        //读取配置文件的方法一(此时的文件默认在当前的module下)
        //FileInputStream fis = new FileInputStream("jdbc.properties");
        //properties.load(fis);
        //读取配置文件的方法二(此时的文件默认在module的src下)
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc2.properties");
        properties.load(resourceAsStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user="+user);
        System.out.println("password="+password);
    }
}
