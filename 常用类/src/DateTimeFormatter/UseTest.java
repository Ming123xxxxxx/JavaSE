package DateTimeFormatter;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/23 16:14
 */
public class UseTest {

    //DateTimeFormatter:格式化或解析日期、时间,类似于SimpleDateFormat
    @Test
    public void test(){
        //方式一:预定义的标准格式
        DateTimeFormatter dateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化:将日期转化为字符串
        System.out.println(LocalDateTime.now());
        String format = dateTime.format(LocalDateTime.now());
        System.out.println(format);
        //解析:将字符串转化为日期
        TemporalAccessor parse = dateTime.parse("2022-02-23T16:20:08.997");
        System.out.println(parse);
        //方式二:本地化相关的格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //方式三:自定义的格式（相比与前两中自定义方式更常用）
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
    }
}
