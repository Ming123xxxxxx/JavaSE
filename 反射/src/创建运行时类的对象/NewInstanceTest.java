package 创建运行时类的对象;

import org.junit.Test;

import java.util.Random;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/19 14:41
 */

//通过反射创建对应的运行时类的对象
public class NewInstanceTest {

    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        Class<Person> personClass = Person.class;
        //newInstance():调用此方法,创建对应的运行时类的对象
        //内部调用了运行时类的空参构造器
        //要想此方法正常的创建运行时类的对象,要求:
        //1.运行时类必须提供空参的构造器
        //2.空参的构造器的访问权限得够
        //在javaBean中要求体重一个public的空参构造器,原因:
        //1.便于通过反射创建运行时类的对象
        //2.便于子类继承此运行时类时,默认调用super()时,保证父类有此构造器
        Person person = personClass.newInstance();
        System.out.println(person);
    }

    @Test
    public void test1() throws Exception {
        int i = new Random().nextInt(3);
        String classpath="";
        switch (i){
            case 0:
                classpath="java.util.Date";
                break;
            case 1:
                classpath="java.lang.Object";
                break;
            case 2:
                classpath="创建运行时类的对象.Person";
                break;
        }
        Object o = test2(classpath);
        System.out.println(o);

    }

    //创建一个指定类的对象,classpath:指定类的全类名
    public Object test2(String classpath) throws Exception{
        Class<?> aClass = Class.forName(classpath);
        return aClass.newInstance();
    }
}
