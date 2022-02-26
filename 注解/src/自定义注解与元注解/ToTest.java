package 自定义注解与元注解;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/25 16:20
 */
@MyAnnotation(value = "helloClass")
public class ToTest {

    @MyAnnotation(value = "helloFiled")
    public int i =10;

    @MyAnnotation(value = "helloConstructe")
    public ToTest(){

    }

    @MyAnnotation(value = "helloMethod")
    @Test
    public void test(){

        @MyAnnotation(value = "hello")
        int p=20;
    }

}
