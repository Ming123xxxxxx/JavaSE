package 常见的异常举例.运行时异常RunTimeException;

import org.junit.Test;

import java.lang.reflect.Array;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/7 14:52
 */
public class ArrayIndexOutofBoundsExceptionTest {

    //数组角标越界  ArrayIndexOutOfBoundsException
    public static void main(String[] args) {
        int[] p = new int[2];
        System.out.println(p[5]);
    }

    //字符串角标越界  StringIndexOutOfBoundsException
    @Test
    public void test(){
        String p ="abc";
        System.out.println(p.charAt(4));
    }
}
