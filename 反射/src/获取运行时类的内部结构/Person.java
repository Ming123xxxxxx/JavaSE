package 获取运行时类的内部结构;

import java.io.IOException;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/19 15:10
 */
@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>,MyInterface {

    private String name;
    int age;
    public int id;

    public Person(){}

    private Person(String name) {
        this.name = name;
    }

    @MyAnnotation(value = "abc")
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是:"+nation);
        return nation;
    }

    private static void sleeps(){
        System.out.println("sleeps()执行");
    }

    private String display(String inters){
        return inters;
    }

    @MyAnnotation
    public void watch() throws IOException {

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {

        System.out.println("人");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
