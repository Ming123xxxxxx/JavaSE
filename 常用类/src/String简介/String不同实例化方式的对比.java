package String简介;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/20 16:45
 */
public class String不同实例化方式的对比 {

    //String不同实例化方式的对比
    //String s=new String("abc")的方式创建对象,在内存中创建了几个对象?
    //答:两个,一个是堆空间中new结构,另一个是char[]对应的常量池中的数据"abc"
    @Test
    public void test(){
        //此时s1和s2的数据abcd声明在方法区中的字符串常量池中
        String s1 ="abcd";
        String s2 ="abcd";
        //通过new+构造器的方式:此时的s3和s4保存的地址值,是数据在堆空间中开辟以后对应的地址值
        String s3 = new String("abcd");
        String s4 = new String("abcd");
        System.out.println(s1==s2);//true
        System.out.println(s2==s3);//false
        System.out.println(s3==s4);//false
    }
}
