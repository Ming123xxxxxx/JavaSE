package 获取运行时类的内部结构;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/20 14:42
 */
public class GetFatherClass {


    @Test
    public void test(){
        Class<Person> personClass = Person.class;
        //getSuperclass()://获取运行时的类的父类
        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass);
        System.out.println("-----------");
        //getGenericSuperclass():获取运行时的类的的带泛型的父类
        Type genericSuperclass = personClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
        System.out.println("-----------");
        //获取运行时的类的的带泛型的父类的泛型
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (Type t :actualTypeArguments ){
            System.out.println(t.getTypeName());
        }
    }
}
