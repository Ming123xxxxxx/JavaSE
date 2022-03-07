package 常见的异常举例.运行时异常RunTimeException;

import org.junit.Test;

import java.lang.reflect.Array;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/7 14:47
 */
public class NullPointExceptionTest {

    //空指针异常  NullPointerException
    public static void main(String[] args) {
        Object object = null;
        System.out.println(Array.get(object, 1));
    }

    //空指针异常  NullPointerException
    @Test
    public void test() {
        int[] objects = null;
        System.out.println(objects[3]);
    }
}
