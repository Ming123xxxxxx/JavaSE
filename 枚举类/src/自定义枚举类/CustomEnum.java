package 自定义枚举类;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/24 15:59
 */
public class CustomEnum {
    public static void main(String[] args) {
        JDK5BeforCustromEnum dad = JDK5BeforCustromEnum.dad;
        System.out.println(dad);
        JDK5AfterCustomEnum dad1 = JDK5AfterCustomEnum.dad;
        System.out.println(dad1);
    }
}
//方式一:JDK5以前,自定义枚举类
class JDK5BeforCustromEnum{
    //声明JDK5BeforCustromEnum对象的属性
    private final String name;
    private final int age;
    //私有化类的构造器，并给对象属性赋值
    private JDK5BeforCustromEnum(String name, int age){
        this.name = name;
        this.age = age;
    }
    //提供当前枚举类的多个对象:public static final xxx
    public static final JDK5BeforCustromEnum dad = new JDK5BeforCustromEnum("爸爸",48);
    public static final JDK5BeforCustromEnum mam = new JDK5BeforCustromEnum("妈妈",46);
    public static final JDK5BeforCustromEnum gradad = new JDK5BeforCustromEnum("爷爷",72);
    public static final JDK5BeforCustromEnum son = new JDK5BeforCustromEnum("儿子",22);
    //获取枚举类对象的属性
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //提供ToString()
    @Override
    public String toString() {
        return "JDK5BeforCustromEnum{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//JDK5及以后,可以使用enun关键字自定义枚举类
enum JDK5AfterCustomEnum{
    //提供当前枚举类的对象,多个对象之间用","隔开,末尾的对象用";"
    dad("爸爸",48),
    mam("妈妈",46),
    gradad("爷爷",72),
    son("儿子",22);

    //声明JDK5BeforCustromEnum对象的属性
    private final String name;
    private final int age;

    //私有化类的构造器，并给对象属性赋值
    private JDK5AfterCustomEnum(String name, int age){
        this.name = name;
        this.age = age;
    }

    //获取枚举类对象的属性
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //提供ToString(),若不重写toString(),则输出默认为对象名字
    @Override
    public String toString() {
        return "JDK5AfterCustomEnum{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}