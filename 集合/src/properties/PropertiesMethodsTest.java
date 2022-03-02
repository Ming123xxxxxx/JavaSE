package properties;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/2 16:23
 */
public class PropertiesMethodsTest {

    @Test
    public void test() throws Exception {
        FileInputStream fileInputStream=null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream("D:\\IntelliJ IDEA 2020.1\\JavaSE\\集合\\src\\properties\\jdbc.properties");
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("username"));
            System.out.println(properties.getProperty("password"));
        } finally {
            if(fileInputStream!=null){
                fileInputStream.close();
            }
        }
    }
}
