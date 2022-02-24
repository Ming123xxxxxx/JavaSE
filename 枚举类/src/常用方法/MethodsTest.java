package 常用方法;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/24 16:33
 */
public class MethodsTest {

    public static void main(String[] args) {
        //toString()
        System.out.println(season.dad.toString());
        System.out.println("----------------");
        //values():返回一个枚举类集合,集合中为枚举类中的所有对象
        season[] values = season.values();
        for(season s : values){
            System.out.println(s);
        }
        System.out.println("----------------");
        //valueOf(String objName):返回枚举类中对象名为"gradad"的对象
        //若枚举类中没有此对象,则报java.lang.IllegalArgumentException
        System.out.println(season.valueOf("gradad"));
        System.out.println(season.valueOf("gradad1"));
    }
}

enum season{
    //提供当前枚举类的对象,多个对象之间用","隔开,末尾的对象用";"
    dad("爸爸",48),
    mam("妈妈",46),
    gradad("爷爷",72),
    son("儿子",22);

    //声明JDK5BeforCustromEnum对象的属性
    private final String name;
    private final int age;

    //私有化类的构造器，并给对象属性赋值
    private season(String name, int age){
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
        return "season{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
