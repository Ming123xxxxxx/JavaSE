package 方法引用;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/14 9:24
 */
public class EmployeeData {

    public static List<Emploee> ferEmployees(){

        List<Emploee> list = new ArrayList<>();
        list.add(new Emploee(1001,"马云",34,123412));
        list.add(new Emploee(1002,"马化腾",32,43121));
        list.add(new Emploee(1003,"雷军",51,54312));
        list.add(new Emploee(1004,"李嘉诚",123,711213));
        list.add(new Emploee(1005,"刘强东",313,416121));

        return list;
    }
}
