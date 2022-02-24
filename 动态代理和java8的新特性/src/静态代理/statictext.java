package 静态代理;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/13 9:53
 */

//静态代理特特点:代理类和被代理类在编译期间就确定下来了

interface ClothFactory{
    void produceCloth();
}

class proxClothFactory implements ClothFactory{

    private ClothFactory factory;//用被代理对象进行实例化

    public proxClothFactory(ClothFactory factory){
        this.factory=factory;
    }

    @Override
    public void produceCloth() {

        System.out.println("代理工厂做一个工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续工作");
    }
}


//被代理类
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}

public class statictext{
    public static void main(String[] args) {

        //创建被代理类的对象
        ClothFactory factory = new NikeClothFactory();
        //创建代理类的对象
        ClothFactory clothFactory = new proxClothFactory(factory);

        clothFactory.produceCloth();

    }
}

