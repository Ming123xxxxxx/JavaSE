package 使用enum关键字定义的枚举类实现接口;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/24 16:47
 */
public enum Season implements info{
    //提供当前枚举类的对象,多个对象之间用","隔开,末尾的对象用";"
    //让枚举类的对象分别实现接口中的抽象方法
    dad("爸爸",48){
        @Override
        public void show() {
            System.out.print("This ");
        }
    },
    mam("妈妈",46){
        @Override
        public void show() {
            System.out.print("is ");
        }
    },
    gradad("爷爷",72){
        @Override
        public void show() {
            System.out.print("a ");
        }
    },
    son("儿子",22){
        @Override
        public void show() {
            System.out.print("family");
        }
    };

    //声明JDK5BeforCustromEnum对象的属性
    private final String name;
    private final int age;

    //私有化类的构造器，并给对象属性赋值
    private Season(String name, int age){
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
}
