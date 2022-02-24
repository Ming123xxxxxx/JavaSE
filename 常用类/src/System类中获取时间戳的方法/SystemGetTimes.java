package System类中获取时间戳的方法;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/22 16:43
 */
public class SystemGetTimes {

    @Test
    public void test(){
        //currentTimeMillis():获取从1970年1月1日0时0分0开始到现在的以毫秒为单位的时间差
        System.out.println(System.currentTimeMillis());
    }
}
