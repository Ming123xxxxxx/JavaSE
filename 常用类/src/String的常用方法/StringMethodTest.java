package String的常用方法;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/21 14:58
 */
public class StringMethodTest {

    @Test
    public void test(){
        String s1 =" Hello World ";
        System.out.println("length()--:"+s1.length());//返回字符串长度
        System.out.println("charAt()--:"+s1.charAt(5));//返回字符串指定索引处的值
        System.out.println("isEmpty()--:"+s1.isEmpty());//判断字符串是否为空
        System.out.println("toUpperCase()--:"+s1.toUpperCase());//将字符串中的字符转化为大写
        System.out.println("toLowerCase()--:"+s1.toLowerCase());//将字符串中的字符转化为小写
        System.out.println("trim()--:"+s1.trim());//忽略字符串的头和尾的空格，字符串中间的空格不变
        System.out.println("equals()--:"+"HelloWorld".equals(s1));//比较字符串内容是否相同
        System.out.println("equalsIgnoreCase()--:"+" hELLo wOrlD ".equalsIgnoreCase(s1));//比较字符串内容是否相同,忽略大小写
        System.out.println("concat()--:"+s1.concat("--concat()"));//拼接字符串,等价于“+"
        //比较两个字符串的大小,按照索引一一对比,只要一处索引不同，就会返回两索引处字符的差值,若为正数,调用compareTo()的字符串大,负数则小
        System.out.println("compareTo()--:"+"abc".compareTo("abec"));
        System.out.println("substring(int b)--:"+s1.substring(5));//返回从字符串索引处到尾部的所有值
        System.out.println("substring(int b,int e)--:"+s1.substring(5,9));//返回从字符串索引从5到9的所有值
        System.out.println("endsWith()--:"+s1.endsWith("ld "));//测试此字符串是否以"ld "结尾
        System.out.println("startsWith(String suffix)--:"+s1.startsWith(" He"));//测试此字符串是否以" He"开头的
        //测试此字符串是否在索引处为3的地方以”ll“开头
        System.out.println("startsWith(String suffix,int index)--:"+s1.startsWith("ll",3));
        System.out.println("contains()--:"+s1.contains("ll"));//测试字符串中是否包含"ll"
        System.out.println("indexOf(String str)--:"+s1.indexOf("lo"));//返回"lo"在字符串中首次出现的索引位置,若没有则返回-1
        //返回"lo"在字符串索引从6开始出现的索引位置,若没有则返回-1
        System.out.println("indexOf(String str,int index)--:"+s1.indexOf("lo",6));
        System.out.println("lastIndexOf(String str)--:"+s1.lastIndexOf("lo"));//从后往前找字符串中首次出现"lo"的从前往后数的索引,若没有则返回-1
        //从前往后数的索引处开始向前查找字符串中首次出现"lo"的从前往后数的索引,若没有则返回-1
        System.out.println("lastIndexOf(String str,int index)--:"+s1.lastIndexOf("lo",3));
        System.out.println("replace()--:"+s1.replace('l','p'));//将原有字符串中的所有'l'字符转换为'p'字符
        System.out.println("replace()--:"+s1.replace("ll","pp"));//将原有字符串中的所有"ll"字符串转换为"pp"字符串
        System.out.println("replaceAll()--:"+"12daweq212dqw1".replaceAll("\\d",","));
    }
}
