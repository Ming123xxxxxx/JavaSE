package 获取运行时类的内部结构;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/19 15:51
 */
public class MethodTest {

    //获取运行时类的方法结构
    @Test
    public void test(){
        Class<Person> personClass = Person.class;

        //getMethods():获取当前运行时类及其父类的public方法
        Method[] methods = personClass.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println("-----------------");
        //getDeclaredMethods():获取当前运行时类中声明的所有方法,不包含父类的方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for(Method m : declaredMethods){
            System.out.println(m);
        }
    }

    //获取运行时类的方法的内部结构
    @Test
    public void test1(){
        Class<Person> personClass = Person.class;
        //getMethods():获取当前运行时类及其父类的public方法
        Method[] methods = personClass.getMethods();
        for(Method m : methods){
            //1.获取方法声明的注解
            Annotation[] annotation = m.getAnnotations();
            for (Annotation a : annotation){
                System.out.print("方法声明的注解:"+a+"\t");
            }
            //2.获取方法声明的权限修饰符
            System.out.print("方法的权限修饰符"+Modifier.toString(m.getModifiers())+"\t");
            //3.获取返回值类型
            System.out.print("返回值类型:"+m.getReturnType().getName()+"\t");
            //4.获取方法名
            System.out.print(m.getName());
            System.out.print("(");
            //5.形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if(!(parameterTypes==null && parameterTypes.length==0)){
                for (Class s : parameterTypes){
                    System.out.print(s);
                }
            }
            System.out.print(")"+"\t");
            //6.抛出的异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if(!(exceptionTypes==null && exceptionTypes.length==0)){
                for (Class s : exceptionTypes){
                    System.out.print(s);
                }
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }
}
