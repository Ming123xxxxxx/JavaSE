package 反射之前类的实例化等操作;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/18 14:51
 */
public class ReflectionTest {

    //反射之前对于Person的操作
    @Test
    public void test(){
        //1.创建Person类的对象
        Person person = new Person("Tom",33);
        //2.通过对象,调用其内部的属性,方法
        person.age=10;
        System.out.println(person.toString());
        person.show();
        //在Person类的外部,不可以通过Person类的对象调用内部私有结构
        //比如name,showNation()，以及私有的构造器
    }

    //使用反射之后,对于Person的操作

    @Test
    public void test2() throws Exception {
        Class<Person> personClass = Person.class;

        //1.通过反射,创建Person类的对象
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person tom = constructor.newInstance("Tom", 12);
        System.out.println(tom.toString());

        //2.通过反射,调用对象指定的属性,方法
        //调用属性
        Field age = personClass.getDeclaredField("age");
        age.set(tom,10);
        System.out.println(tom.toString());
        //调用方法
        Method show = personClass.getDeclaredMethod("show");
        show.invoke(tom);

        //通过反射,可以调用Person类的私有结构的,如,私有构造器/属性/方法
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);
        //调用私有构造器
        declaredConstructor.setAccessible(true);
        Person jerry = declaredConstructor.newInstance("Jerry");
        System.out.println(jerry.toString());
        //调用私有属性
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(jerry,"Lucy");
        System.out.println(jerry);
        //调用私有的方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        Object xx = showNation.invoke(jerry, "中国");
        System.out.println(xx);
    }

}
