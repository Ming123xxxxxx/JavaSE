package Class实例的获取;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/18 15:48
 */
public class GetClassTest {
    
    @Test
    public void test() throws ClassNotFoundException {
        //方式一:第哦啊用运行时类的属性: 对象.class
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
        //方式二:通过运行时类的对象,调用getClass()
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println(aClass);
        //方式三:调用Class的静态方法:forName(String classPath)
        Class<?> aClass1 = Class.forName("Class实例的获取.Person");
        System.out.println(aClass1);

        System.out.println(personClass==aClass);
        System.out.println(personClass==aClass1);
        System.out.println(aClass==aClass1);

        //方法四:使用类的加载器:ClassLoader
        ClassLoader classLoader = GetClassTest.class.getClassLoader();
        Class<?> aClass2 = classLoader.loadClass("Class实例的获取.Person");
        System.out.println(aClass2);

        System.out.println(aClass==aClass2);
    }
}
