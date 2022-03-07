package 常见的异常举例.运行时异常RunTimeException;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/7 15:00
 */
public class NumberFormatExceptionTest {

    //数值转换异常  NumberFormatException
    public static void main(String[] args) {

        String str ="abc";
        int p =Integer.parseInt(str);
    }
}
