package String的常用方法;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/21 16:15
 */
public class String和byte数组之间转化 {
    
    @Test
    public void test() throws UnsupportedEncodingException {
        String str ="abc123家哇";
        //getBytes():将String转化为byte[]
        byte[] bytes = str.getBytes();//使用默认的字符集进行编码
        System.out.println( Arrays.toString(bytes));
        System.out.println("----------------");
        byte[] gbks = str.getBytes("gbk");//使用指定的字符集gbk进行编码
        System.out.println(Arrays.toString(gbks));
        System.out.println("----------------");
        System.out.println(new String(bytes));//使用默认的字符集进行解码
        System.out.println(new String(gbks));//使用默认的字符集进行解码，出现乱码,因为编码集和解码集不一致
        System.out.println(new String(gbks,"gbk"));//使用指定的字符集gbk的进行解码
    }
}
