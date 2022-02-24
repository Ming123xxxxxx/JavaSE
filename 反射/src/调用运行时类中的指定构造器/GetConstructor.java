package 调用运行时类中的指定构造器;

import org.junit.Test;
import 获取运行时类的内部结构.Person;

import java.lang.reflect.Constructor;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/20 15:51
 */
public class GetConstructor {

    @Test
    public void test() throws Exception{
        Class<Person> personClass = Person.class;
        //getDeclaredConstructor():获取指定的构造器,参数为指明的构造器的形参列表
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);
        //setAccessible():保证当前属性是可访问的
        //只有将setAccessible设置为true,获取的类中的除了public类型以外的变量的属性值才嫩被修改设置
        declaredConstructor.setAccessible(true);
        //创建此构造器的运行时类的对象
        Person person = declaredConstructor.newInstance("Tom");
        System.out.println(person.toString());
    }
}
