package 获取运行时类的内部结构;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/19 16:27
 */
public class ConstructTest {

    //获取构造器结构
    @Test
    public void test(){
        Class<Person> personClass = Person.class;
        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor[] constructor = personClass.getConstructors();
        for(Constructor c : constructor){
            System.out.println(c);
        }
        System.out.println("-----------");
        //getDeclaredConstructors():获取当前运行时类中声明的所有的构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }
}
