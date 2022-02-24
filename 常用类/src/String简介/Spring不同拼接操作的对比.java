package String简介;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/21 14:22
 */
public class Spring不同拼接操作的对比 {

    @Test
    public void test() {
        String s1 ="javaEE";
        String s2="hadoop";
        String s3="javaEEhadoop";
        String s4="javaEE"+"hadoop";
        String s5=s1+"hadoop";
        String s6="javaEE"+s2;
        String s7=s1+s2;
        String s8=(s1+s2).intern();
        final String s9 ="javaEE";//此时s9就变成常量了
        String s10 = s9+"hadoop";
        System.out.println(s3==s4);//true
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
        System.out.println(s3==s7);//false
        System.out.println(s3==s8);//true
        System.out.println(s5==s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s3==s10);//true
    }
}
