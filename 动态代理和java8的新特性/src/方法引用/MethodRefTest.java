package 方法引用;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/14 9:24
 */
/*
* 方法引用的使用
* 1.使用情境:当要传递给Lambda体的操作,已经有实现的方法了,可以使用方法引用
* 2.方法引用,本质上就是Lambda表达式.而Lambda表达式作为函数式接口的实例,
*  所以方法引用,也是函数式接口的实例
*
* 3.使用格式 :
*       类(或对象) :: 方法名
*
* 4.具体分为如下的三种情况
*    (1) 对象 :: 非静态方法   (情况1)
*    (2) 类 :: 静态方法      (情况2)
*    (3) 类 :: 非静态方法    (情况3)
*
*
* 5.方法引用使用的要求:接口中的抽象方法的形参列表和返回值类型与
* 方法引用的方法的形参列表的返回值类型相同(针对于情况1和情况2)
* */
public class MethodRefTest {

    //情况一:对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test1(){

        Consumer<String> consumer = str-> System.out.println(str);
        consumer.accept("使用Lambda表达式");

        System.out.println("----------------");

        PrintStream ps = System.out;
        Consumer<String> consumer1 =ps :: println;
        consumer1.accept("使用方法引用");
    }

    //Supplier中的T get()
    //Employee中的String getName()
    @Test
    public void test2(){

        Emploee emploee = new Emploee(1001,"Tom",31,24123);
        //使用Lambda
        Supplier<String> stringSupplie = () -> emploee.getName();
        System.out.println(stringSupplie.get());

        System.out.println("---------------------");

        //使用方法引用
        Supplier<String> stringSupplier = emploee::getName;
        System.out.println(stringSupplier.get());

    }

    //情况2: 类 :: 静态方法
    //Comparator中的int compare(T t1,T t2)
    //Integer中的int compare(T t1,T t2)
    @Test
    public void test3(){
        Comparator<Integer> comparator = (t1,t2) -> Integer.compare(t1,t2);
        System.out.println("使用Lambda表达式="+comparator.compare(20,31));

        System.out.println("-----------------------");

        Comparator<Integer> comparator1 = Integer::compare;
        System.out.println("使用方法引用="+comparator1.compare(31,21));
    }

    //Function中的apply(T t)
    //Math中的Long round(Double d)
    @Test
    public void test4(){
        Function<Double,Long> fUnction = d -> Math.round(d);
        System.out.println("使用Lambda表达式="+fUnction.apply(10.0));

        System.out.println("---------------------------");

        Function<Double,Long> function = Math :: round;
        System.out.println("使用方法引用="+function.apply(30.0));
    }

    //情况3: 类 :: 实例方法
    //Comparator中的int compare(T t1,T t2)
    //String中的int t1.compareTo(t2)
    @Test
    public  void Test5(){

        Comparator<String> comparator = (s1,s2) -> s1.compareTo(s2);
        System.out.println("使用Lambda表达式="+comparator.compare("abc","abb"));

        System.out.println("-----------------------------");

        Comparator<String> comparator1 = String::compareTo;
        System.out.println("使用方法引用="+comparator1.compare("abb","cbb"));
    }

    //BiPredicate中的boolean test(T t1,T t2)
    //String中的boolean t1.equals(t2)
    @Test
    public void Test6(){

        BiPredicate<String,String> predicate = (s1,s2) -> s1.equals(s2);
        System.out.println("使用Lambda表达式="+predicate.test("abb","bab"));

        System.out.println("-----------------------------");

        BiPredicate<String,String> biPredicate = String :: equals;
        System.out.println("使用方法引用="+biPredicate.test("acc","abc"));
    }

    //Function中的 R apply(T t)
    //Employee中的String getName()
    @Test
    public void Test7(){

        Function<Emploee,String> function = s -> s.getName();
        System.out.println("使用Lambda表达式="+function.apply(new Emploee(1001,"jery",31,1241321)));

        System.out.println("-----------------------------");

        Function<Emploee,String> function1 = Emploee::getName;
        System.out.println("使用方法引用="+function1.apply(new Emploee(1002,"lucy",41,51231)));

    }


}
