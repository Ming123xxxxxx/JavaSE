package 方法引用;

import java.util.Objects;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/14 9:24
 */
public class Emploee {

    private int id;
    private String name;
    private int age;
    private double salary;

    public Emploee(int id) {
        this.id=id;
    }

    public Emploee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emploee(){

    }

    public Emploee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emploee emploee = (Emploee) o;
        return id == emploee.id &&
                age == emploee.age &&
                Double.compare(emploee.salary, salary) == 0 &&
                Objects.equals(name, emploee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
