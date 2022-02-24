package 获取运行时类的接口所在包注解;

import org.junit.Test;
import 获取运行时类的内部结构.Person;

import java.lang.annotation.Annotation;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/20 15:01
 */
public class GetClassInterfacePackageAnnotation {

    @Test
    public void test(){
        Class<Person> personClass = Person.class;
        //getInterfaces():获取运行时类的接口
        Class<?>[] interfaces = personClass.getInterfaces();
        for(Class s :interfaces){
            System.out.println(s);
        }
        System.out.println("-----------------------");
        //获取运行时类的父类的接口
        Class<?>[] interfaces2 = personClass.getSuperclass().getInterfaces();
        for(Class s :interfaces2){
            System.out.println(s);
        }
        //getPackage():获取当前运行时类所在的包
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);
        Annotation[] annotations = personClass.getAnnotations();
        //getAnnotations():获取当前运行时类的注解
        for(Annotation s :annotations){
            System.out.println(s);
        }
    }
}
