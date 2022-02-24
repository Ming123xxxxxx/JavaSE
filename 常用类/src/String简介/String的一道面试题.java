package String简介;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/21 14:39
 */
public class String的一道面试题 {

    String str = new String ("good");
    char[] ch = {'t','e','s','t'};
    int in=10;

    public void Change(String str,char ch[],int in){
        str="low";
        ch[0] = 'b';
        in=30;
    }

   @Test
    public void test(){
       Change(str,ch,in);
       System.out.println(str);//good
       System.out.println(ch);//best
       System.out.println(in);//10
   }

}
