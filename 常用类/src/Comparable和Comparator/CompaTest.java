package Comparable和Comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

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
        Books[] arr = new Books[4];
        arr[0]=new Books("Java从入门到入土","Ming",2000);
        arr[1]=new Books("Mysql从入门到删库","Ling",300);
        arr[2]=new Books("SpringBoot从入门到精通","xxx",700);
        arr[3]=new Books("Linux从入门到入牢","Linus",1000);
        Arrays.sort(arr);
        for(Books b: arr){
           System.out.println(b);
        }
    }

    //Comparator接口的使用:定制排序
    //背景:当元素的类型没有实现Comparable接口而又不方便修改代码时
    //或实现了Comparable接口的排序规则不适合当前的操作,那么可以考虑使用Comparator的对象来排序
    //重写:重写compare(Object o1,Object o2)的方法，比较o1和o2的大小,如果方法返回正整数,
    //则表示o1大于o2,如果返回0,表示相等,返回负整数.表示o1等于o2
    @Test
    public void test1(){
        String[] arr = new String[]{"CC","DD","AA","RR","呵呵","FF"};
        //按照字符串从大到小的顺序排序
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        //也可简写为Arrays.sort(arr,(e1,e2) -> {return -e1.compareTo(e2)});
        System.out.println(Arrays.toString(arr));
    }
}
