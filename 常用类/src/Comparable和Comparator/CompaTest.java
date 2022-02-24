package Comparable和Comparator;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/23 16:47
 */

//在Java中的对象,正常情况下,只能进行==和!=的比较,不能使用>或<
//但是在开发场景中,我们需要对多个对象进行排序,进行对象的比较大小
//此时就可以通过Comparable和Comparator进行比较
public class CompaTest {

    //Comparable的使用
    //像String,包装类等实现了Comparable接口,重写了compareTo()方法,实现了比较对象大小的方法
    //String,包装类等实现了Comparable接口,重写了compareTo()方法以后,进行了从小到大的排序
    //重写compareTo的规则:x.comparaTo(b) ,返回x和b的差值,可为正可为负也可为0
    @Test
    public void test(){
        String[] arr = new String[]{"xx","cc","呵呵","aa","dd"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
