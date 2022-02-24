package String的常用方法;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/21 16:10
 */
public class String与char数组之间的转换 {

    @Test
    public void test(){
        String str ="abc123";
        //toCharArray():将String转化为char[]
        char[] chars = str.toCharArray();
        for(char c : chars){
            System.out.println(c);
        }
        System.out.println("------------");
        //将char[]转化为String
        System.out.println(new String(chars));
    }
}
