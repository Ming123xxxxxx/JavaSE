package 调用运行时类的指定方法;

import org.junit.Test;
import 获取运行时类的内部结构.Person;

import java.lang.reflect.Method;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/20 15:32
 */
public class GetMethod {

    @Test
    public void test() throws Exception{
        Class<Person> personClass = Person.class;
        //创建运行时类的对象
        Person person = (Person)personClass.newInstance();
        //1。获取指定的某个方法
        //getDeclaredMethod():获取当前运行时类的指定方法
        //参数一:获取的方法  ,参数二:获取的方法的形参列表
        Method declaredMethod = personClass.getDeclaredMethod("show",String.class);
        //setAccessible():保证当前属性是可访问的
        //只有将setAccessible设置为true,获取的类中的除了public类型以外的变量的属性值才嫩被修改设置
        declaredMethod.setAccessible(true);
        //invoke():参数一:方法的调用者,  参数二:给方法的形参赋的值
        //invoke():invoke()的返回值即为调用的方法的返回值
        Object x = declaredMethod.invoke(person, "中国");
        System.out.println("show()的返回值为:"+x);

        //如何调用静态方法
        Method sleeps = personClass.getDeclaredMethod("sleeps");
        sleeps.setAccessible(true);
        //如果调用的运行时类的方法没有返回值,则invoke()返回值为null
        Object invoke = sleeps.invoke(Person.class);
        System.out.println("sleeps()的返回值为="+invoke);
    }
}
