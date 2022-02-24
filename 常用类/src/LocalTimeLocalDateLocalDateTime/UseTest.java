package LocalTimeLocalDateLocalDateTime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/23 15:36
 */
public class UseTest {

    //LocalDate、LocalTime、LocalDateTime的使用
    //LocalDateTime的使用频率比LocalDate、LocalTime要高
    @Test
    public void test(){
        //now():获取当前日期(LocalDate)、时间(LocalTime)、日期+时间(LocalTimeDate)
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        //of():指定日期时间，设置年、月、日、时、分、秒,没有偏移量
        LocalDateTime of = LocalDateTime.of(2020, 10, 5, 12, 31, 12);
        System.out.println(of);
        //getxxx():获取时间
        System.out.println(of.getDayOfMonth());
        System.out.println(of.getDayOfWeek());
        System.out.println(of.getDayOfYear());
        System.out.println(of.getMonth());
        //Withxxx():修改日期并返回，体现了不可变性
        LocalDateTime localDateTime = of.withDayOfMonth(22);
        System.out.println(of);
        System.out.println(localDateTime);
        //plusxxx():在当前日期上增加相应时间并返回
        System.out.println(of.plusMonths(3));
        //minusxxx():在当前日期上减少相应时间并返回
        System.out.println(of.minusDays(20));


    }
}
