package Set;

import java.util.Objects;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/26 15:44
 */
public class Person implements Comparable{

    private String name;
    private int age;

    public Person() {
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //按照姓名长度从小到大排
    @Override
    public int compareTo(Object o) {
       if(o instanceof Person){
           //判断name的长度是否相同
           if(((Person) o).name.length()!=this.name.length()){
               return this.name.length()-((Person) o).name.length();
           }else{
               //若name长度相同,则比较age,并返回差值
               return this.age-((Person) o).age;
           }
       }else{
           throw new  RuntimeException("输入类型不匹配");
       }
    }
}
