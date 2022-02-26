package 自定义注解与元注解;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/25 16:16
 */
@Inherited
@Documented
//@Retention:指定@MyAnnotation的生命周期
@Retention(RetentionPolicy.RUNTIME)
//@Target:指明@MyAnnotation能修饰哪些结构
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
public @interface MyAnnotation {
    String value();
}
