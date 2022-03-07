package 常见的异常举例.运行时异常RunTimeException;

import java.util.Date;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/7 14:59
 */
public class ClassCastExceptionTest {

    //类型转换异常  ClassCastException
    public static void main(String[] args) {
        Object obj = new Date();
        String p = (String) obj;
    }
}
