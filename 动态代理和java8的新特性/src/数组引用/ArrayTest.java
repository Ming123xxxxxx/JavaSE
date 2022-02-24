package 数组引用;

import org.junit.Test;
import sun.security.util.Length;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/14 10:47
 */
public class ArrayTest {

    //可以把数组堪称是一个特殊的类,则写法和构造器引用一致
    @Test
    public void test(){
        Function<Integer,String[]> function = Length -> new String[Length];
        System.out.println("使用Lambda表达式="+(Arrays.toString( function.apply(5))));

        System.out.println("-------------------------------");

        Function<Integer,String[]> function1 = String[] :: new ;
        System.out.println("使用数组引用="+(Arrays.toString( function1.apply(5))));

    }
}
