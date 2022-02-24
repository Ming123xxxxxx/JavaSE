package instant;

import org.junit.Test;

import java.time.Instant;
import java.time.ZoneOffset;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/23 15:58
 */
public class InstantTest {

    //Instant的使用
    @Test
    public void test(){
        //now():获取UTC时区的时间,与中国时间相差8小时
        Instant now = Instant.now();
        System.out.println(now);
        //atOffset():设置偏移量
        System.out.println(now.atOffset(ZoneOffset.ofHours(8)));
        //toEpochMilli():获取自1970年1月1日0时0分0秒(UTC)开始到现在的毫秒数
        System.out.println(now.toEpochMilli());
        //ofEpochMilli():通过给定的毫秒数,获得Instant实例
        Instant instant = Instant.ofEpochMilli(521213131231L);
        System.out.println(instant);

    }
}
