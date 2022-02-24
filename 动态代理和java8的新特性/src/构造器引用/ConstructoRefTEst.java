package 构造器引用;

import org.junit.Test;
import 方法引用.Emploee;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/14 9:24
 */

//构造器引用:和方法引用类似,函数式接口的抽象方法的形参列表和构造器的形参列表一致
//         抽象方法的返回值类型即为构造器所属的类的类型
public class ConstructoRefTEst {

    //构造器引用
    //Supplier中的T get()
    //Emploee的空参构造器
    @Test
    public void test1(){

        //正常写法
        Supplier<Emploee> supplier = new Supplier<Emploee>() {
            @Override
            public Emploee get() {
                return new Emploee();
            }
        };

        System.out.println("---------------------------");

        //Lambda表达式
        Supplier<Emploee> supplier1 = () -> new Emploee();

        System.out.println("---------------------------");

        //构造器引用
        Supplier<Emploee> supplier2 = Emploee::new;

    }

    //Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Emploee> function = id -> new Emploee(id);
        System.out.println("使用Lambda表达式="+function.apply(1001));

        System.out.println("---------------------------");

        Function<Integer,Emploee> function1 = Emploee::new;
        System.out.println("使用构造器引用="+function.apply(1002));

    }

    //BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer,String,Emploee> function = (id ,name) -> new Emploee(id,name);
        System.out.println("使用Lambda表达式="+function.apply(1001,"Tom"));

        System.out.println("---------------------------");

        BiFunction<Integer,String,Emploee> function1 = Emploee::new;
        System.out.println("使用构造器引用="+function1.apply(1002,"cat"));
    }


}
