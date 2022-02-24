package 其他类的使用;

import Comparable和Comparator.Books;
import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/24 15:22
 */
//System,Math,BigInteger,BigDeciml的使用
public class OtherClass {

    @Test
    public void systemtest(){
        //获取java版本
        System.out.println(System.getProperty("java.version"));
        //获取系统名称
        System.out.println(System.getProperty("os.name"));
        //获取系统版本
        System.out.println(System.getProperty("os.version"));
        //获取用户名
        System.out.println(System.getProperty("user.name"));
        //获取用户路径
        System.out.println(System.getProperty("user.home"));
        //获取当前文件地址
        System.out.println(System.getProperty("user.dir"));
    }

    @Test
    public void mathtest(){

    }
}
