package StreamAPI;

import org.junit.Test;
import 方法引用.Emploee;
import 方法引用.EmployeeData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/14 11:05
 */

/*
*   1.Stream关注的式对数据的运算,与CPU打交道,集合关注的是数据的存储,与内层打交道
*   2.
*        a.Stream自己不会存储元素:
*        b.Stream不会改变源对象,相反,他们会返回一个持有结果的新Stream
*        c.Stream操作是延迟执行的,这意味着他们会等到需要结果的时候才执行
*   3.Stream的执行流程:
*        Stream的实例化-->一系列的中间操作(过滤,映射,...)-->终止操作
*   4.说明:
*        a.一个中间操作链,对数据源的数据进行处理
*         b.一旦执行终止操作,就执行中间操作链,并产生结果,之后不会再被使用
*
*
* */

//测试StreamAPI的实例化
public class StreamAPITest {

    //创建Stream方式一:通过集合
    @Test
    public void test1(){
        List<Emploee> list = EmployeeData.ferEmployees();
        //default Stream<E> stream() :返回一个顺序流
        Stream<Emploee> stream = list.stream();
        //default Stream<E> paralletStream() : 返回一个并行流
        Stream<Emploee> emploeeStream = list.parallelStream();
    }

    //创建Stream方式二:通过集合
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5};
        //调用Arrays类的static <T> Stream (T[] array) :返回一个流
        IntStream stream = Arrays.stream(arr);
        Emploee emploee = new Emploee(1001, "马云", 34, 123412);
        Emploee emploee1 = new Emploee(1002, "马化腾", 32, 43121);
        Emploee[] arr2 = new Emploee[]{emploee,emploee1};
        Stream<Emploee> stream1 = Arrays.stream(arr2);
    }

    //创建Stream方式三:通过Stream的of()
    @Test
    public void test3(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
    }

    //创建Stream方式四:创建无限流
    @Test
    public void test4(){
        //迭代
        //public static<T> Stream<T> iterate(final T seed,final UnaryOperation<T> f)
        Stream.iterate(0,t -> t+2).limit(10).forEach(System.out::println);//遍历前十个偶数
        //生成
        //public static<T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
