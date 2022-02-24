package 获取运行时类的内部结构;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/19 15:29
 */
public class FieldTest {

    //获取属性结构
    @Test
    public void test(){
        Class<Person> personClass = Person.class;
        //getFields():获取当前运行时类及其所有父类中声明的public访问权限的属性
        Field[] fields = personClass.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println("--------------------");
        //getDeclaredFields():获取当前运行时类中声明的所有属性
        //private类型的属性也能拿到,不包含父类的属性
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    //权限修饰符 数据类型,变量名
    @Test
    public void test2(){
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field f : declaredFields){
            //1.权限修饰符
            int modifiers = f.getModifiers();
            System.out.print("权限修饰符为:"+ Modifier.toString(modifiers)+"\t");
            //2.数据类型
            Class<?> type = f.getType();
            System.out.print("数据类型为:"+type+"\t");
            //3.变量名
            String name = f.getName();
            System.out.println("变量名为:"+name+"\t");
        }
    }

}
