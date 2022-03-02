package 对象流序列化和反序列化;

import java.io.Serializable;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/2 17:36
 */
public class Person implements Serializable {

    public static final long serialVersionUID=12411242L;

    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
