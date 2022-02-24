package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/13 10:04
 */


interface Human{
    String geyBeleif();
    void eat(String food);
}

//被代理类
class SuperMan implements Human{
    @Override
    public String geyBeleif() {
        return "I Believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃"+food);
    }
}

//要想实现动态代理需要解决的问题
//问题一:如何根据加载到内存中的被代理类.动态的创建一个代理类及对象
//问题二:当通过代理类的对象调用方法时,如何动态的去调用被代理被中的同名方法

class ProxyFactory{
    //调用此方法,返回一个代理类的对象,解决问题一
    public static Object getProxyInstance(Object object){//object:被代理类对象
        MyInvocationHandler invocationHandler = new MyInvocationHandler();
        invocationHandler.bind(object);
        return  Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),invocationHandler);
    }
}

class MyInvocationHandler implements InvocationHandler{

    private Object object;//赋值时也需要使用被代理类的对象进行赋值

    public void bind(Object object){
        this.object=object;
    }

    //当我们通过代理类的对象,调用方法a时,就会自动的调用如下的方法invoke()
    //将被代理类要执行的方法a的功能就声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method:即为代理类对象调用的方法,此对象也就作为了被代理类对象要调用的方法
        //object:被代理类的对象
        Object invoke = method.invoke(object, args);
        //上述方法的返回值就作为当前类中的invoke()返回值
        return invoke;
    }
}

public class ProxyText {

    public static void main(String[] args) {
        //proxyInstance:代理类的对象
        Human proxyInstance =(Human) ProxyFactory.getProxyInstance(new SuperMan());
        //当通过到代理类对象调用方法时,会自动的调用被代理类中同名的方法
        System.out.println( proxyInstance.geyBeleif());
        proxyInstance.eat("四川麻辣烫");
    }
}
