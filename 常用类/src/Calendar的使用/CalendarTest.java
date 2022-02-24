package Calendar的使用;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/23 14:57
 */
public class CalendarTest {

    //Calendar的实例化
    @Test
    public void test(){
        //方式一:创建其子类(GregorianCalendar)的对象
        Calendar calendar= new GregorianCalendar();
        //方式二:调用其方法getInstance()
        Calendar instance = Calendar.getInstance();
        //常用方法
        //get():获取时间
        //当前的参数为获取今天在这个月为第几天
        System.out.println("get()--:"+instance.get(Calendar.DAY_OF_MONTH));
        //当前的参数为获取今天在今年为第几天
        System.out.println("get()--:"+instance.get(Calendar.DAY_OF_YEAR));
        //set():设置时间
        //当前的参数为设置今天在这个月为第10天
        instance.set(Calendar.DAY_OF_MONTH,10);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //add():增加或减少时间
        //当前的参数为在今天在这个月为第几天的基础上+3天
        instance.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //getTime():将日历类转化为Date类
        Date time = calendar.getTime();
        System.out.println(time);
        //setTime():将Date类转化为日历类
        Date date = new Date();
        instance.setTime(date);
    }
}
