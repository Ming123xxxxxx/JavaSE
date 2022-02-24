package Java中两个Date的使用;

import org.junit.Test;

import java.util.Date;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/22 16:49
 */
public class DateTest {

    @Test
    public void test() {
        //构造器1:Date():创建一个对应当前时间的Date对象
        Date date = new Date();
        System.out.println(date);//Tue Feb 22 16:52:10 GMT+08:00 2022
        System.out.println(date.getTime());//获取时间戳
        //构造器2:Date(Long times):参数为Long型的时间戳
        Date date1 = new Date(645519930555L);
        System.out.println(date1);//返回时间戳所在年月日时分秒  Sat Jun 16 15:05:30 GMT+08:00 1990
        java.sql.Date date2 = new java.sql.Date(1145519930555L);//返回时间戳所在年月日时分秒  2006-04-20
        System.out.println(date2);
        //将java.util.date转换为java.sql.date对象
        date = new java.sql.Date(5121312131L);
        System.out.println(date);
    }
}
