package SimpleDateFormat的使用;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/23 14:34
 */
public class SimpleDateFormatTest {

    @Test
    public void test() throws ParseException {
        Date date = new Date();
        System.out.println(date);
        //实例化SimpleDateFormat :使用默认的构造器
        SimpleDateFormat simDateFormate = new SimpleDateFormat();
        //格式化 : 日期转化为字符串
        String format = simDateFormate.format(date);
        System.out.println(format);
        //解析 :格式化的逆过程 ,字符串转化为日期
        Date parse = simDateFormate.parse("20-10-20 上午11:30");
        System.out.println(date);

        //实例化SimpleDateFormat :使用带参的构造器,用指定的方式格式化和解析
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = simpleDateFormat.format(date);
        System.out.println(format1);
        //解析 :格式化的逆过程 ,字符串转化为日期，要求字符串必须是符合SimpleDateForMat识别的格式(通过构造器参数体现)
        Date parse1 = simpleDateFormat.parse("2020-10-20 11:30:21");
        System.out.println(parse1);
    }
}
