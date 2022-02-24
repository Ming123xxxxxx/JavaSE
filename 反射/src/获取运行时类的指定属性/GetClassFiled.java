package 获取运行时类的指定属性;

import org.junit.Test;
import 获取运行时类的内部结构.Person;

import java.lang.reflect.Field;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/20 15:13
 */

//调用运行时类中的指定的结构:属性,方法,构造器
public class GetClassFiled {

    //不推荐使用
    @Test
    public void test() throws Exception {
        Class<Person> personClass = Person.class;
        //创建运行时类的对象
        Person person = (Person)personClass.newInstance();
        //获取指定的属性:要求运行时类中属性声明为public
        Field id = personClass.getField("id");
        //设置当前属性的值
        //set():参数一:指明设置那个对象的属性,参数二:将此属性值设置为多少
        id.set(person,1001);
        //get():参数一:获取哪个对象的当前属性值
        int o =(int)id.get(person);
        System.out.println("id="+o);
    }

    //推荐使用
    @Test
    public void test1() throws Exception{
        Class<Person> personClass = Person.class;
        //创建运行时类的对象
        Person person = (Person)personClass.newInstance();
        //getDeclaredField(String filedNam):获取运行类中指定变量名的属性值
        Field declaredField = personClass.getDeclaredField("name");
        //setAccessible():保证当前属性是可访问的
        //只有将setAccessible设置为true,获取的类中的除了public类型以外的变量的属性值才嫩被修改设置
        declaredField.setAccessible(true);
        declaredField.set(person,"Rose");
        System.out.println("name="+declaredField.get(person));
    }
}
