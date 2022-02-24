package 函数式接口;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Test;
/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/14 8:54
 */
public class FunctionTest {

    @Test
    public void test1(){
        happys(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("不使用Lambda表达式="+aDouble);
            }
        });

        System.out.println("-------------------------");

        happys(600,m -> System.out.println("使用Lambdab表达式="+m));
    }

    public void happys(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }

    @Test
    public void test2(){

        List<String> list = Arrays.asList("上面↑","下面↓","左边←","右边→","左上角↖");
        List<String> list1 = filterString(list, s -> s.contains("边"));
        System.out.println(list1);

    }

    //根据给定的规则,过滤集合中的字符串,此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre){

        ArrayList<String> filterList = new ArrayList<>();

        for (String s: list) {

            if (pre.test(s)){
                filterList.add(s);
            }
        }

        return filterList;

    }

}


