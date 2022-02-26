package 自定义注解与元注解;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/25 16:58
 */
public class GetAnnotation {

    @Test
    public void test2() throws Exception{
        Class<ToTest> toTestClass = ToTest.class;
        System.out.println("ToTest类上的@MyAnntation的value为:--"+toTestClass.getAnnotation(MyAnnotation.class).value());
        String annotation = toTestClass.getField("i").getAnnotation(MyAnnotation.class).value();
        System.out.println("ToTest的i属性上的@MyAnntation的value为:--"+annotation);
        Method test = toTestClass.getMethod("test");
        System.out.println("ToTest的test()上的@MyAnntation的value为:--"+test.getAnnotation(MyAnnotation.class).value());
        String value = toTestClass.getConstructor().getAnnotation(MyAnnotation.class).value();
        System.out.println("ToTest的无参构造上的@MyAnntation的value为:--"+value);
    }
}
