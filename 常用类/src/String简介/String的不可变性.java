package String简介;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/20 16:18
 */
public class String的不可变性 {

    @Test
    public void test1(){
        String s1 ="abc";  //字面量的定义方式
        String s2 ="abc";  //字面量的定义方式
        String s3 ="abc";  //字面量的定义方式
        String s4 ="abc";  //字面量的定义方式
        System.out.println(s1==s2);//比较s1和s2的地址值,为true
        s1="hello";
        System.out.println(s1==s2);//为false
        s3+="def";
        System.out.println(s2==s3);//为false
        String s5 = s4.replace('a', 'm');
        System.out.println("s2="+s2);
        System.out.println("s4="+s4);
        System.out.println("s5="+s5);
        System.out.println(s2==s4);//true
        System.out.println(s2==s5);
    }
}
