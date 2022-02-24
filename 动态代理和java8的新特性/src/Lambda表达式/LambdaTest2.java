package Lambda表达式;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/13 11:20
 */

//Lambda表达式的使用
/*
 格式:
*     -> : Lambda操作符或箭头操作符,
*     ->左边为lambda形参列表(其实就是接口中的抽象方法的形参列表)
*     ->右边为lambda体(其实就是重写的抽象方法的方法体)

 Lambda表达式的使用:(分为6种情况介绍)

         总结:
         ->左边:Lambda形参列表的参数类型可以省略,如果Lambda形参只有一个,则()也可以省略
         ->右边:正常情况方法体应使用{}包裹,若只有一条执行语句(也可能是return)则可以省略{}
         若为return语句,则return也可以省略

 Lambda的本质:作为函数式接口的实例
* */
public class LambdaTest2 {


    @Test
    public void test1(){

        //语法格式一:无参,无返回值
        Runnable runs = () -> System.out.println("(Lambda)无参,无返回值");
        // 可写成  Runnable runs = () -> {
        // System.out.println("(Lambda)无参,无返回值");
        // }
        runs.run();

        System.out.println("-----------------------");

        //语法格式一:有参,无返回值
        Consumer<String> con = (String s) -> {
            System.out.println(s);
        };

        con.accept("(Lambda)有参,无返回值");

        System.out.println("-----------------------");

        //语法格式三:数据类型可以省略,因为可由编译器推断得出,称为"类型推断"
         Consumer<String> con2 = (s) -> {
             System.out.println(s);
         };
        con2.accept("(Lambda)有参,无返回值,类型推断");

        System.out.println("-----------------------");

        //语法格式四:Lambda若只需要一个参数时,参数的小括号可以省略
        Consumer<String> con3 = s -> {
            System.out.println(s);
        };
        con3.accept("(Lambda)有参,无返回值,类型推断,Lambda若只需要一个参数时,参数的小括号可以省略");

        System.out.println("-----------------------");

        //语法格式五:Lambda若需要两个或以上的参数,多条执行语句,并且可以有返回值
        Comparator<Integer> com = (o1,o2) -> {
           return o1.compareTo(o2);
        };
        System.out.println(com.compare(10,31));

        System.out.println("-----------------------");

        //语法格式六:当Lambda体只有一条语句时.return和{}都可以省略
        Comparator<Integer> com1 = (o1,o2) -> o1.compareTo(o2);
        System.out.println(com.compare(41,31));


    }

    //不使用Lambda表达式
    @Test
    public void test2(){

        Runnable runs = new Runnable() {
            @Override
            public void run() {
                System.out.println("无参,无返回值");
            }
        };

        runs.run();

        System.out.println("-------------------");

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("有参,无返回值");

        System.out.println("-------------------");

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com.compare(10,31));


    }

}
