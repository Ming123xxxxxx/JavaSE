package 注解的的使用;


import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/25 15:58
 */
public class AnnotationTest extends son implements info{

    @Test
    public void test(){
        show();
        watch();
    }

    @Deprecated
    @Override
    public void show() {
        System.out.println("Annotation---show()");
    }

    @Override
    public void watch() {
        System.out.println("Annotation---watch()");
    }
}

class son {
    private String name;
    private int age;

    public son() {

    }

    public son(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("son-----show()");
    }
}

interface info{
    void watch();
}