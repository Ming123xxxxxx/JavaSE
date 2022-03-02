package List的常用方法;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/27 16:25
 */
public class ListMethodsTest {

    @Test
    public void test(){
        List list = new ArrayList();
        list.add(123);
        list.add("ABC");
        list.add(new String("OTS"));
        list.add(new Person("Tom",31));
        System.out.println(list);
        //add(int index,Object element):在索引为index处插入element元素
        list.add(2,"add()");
        System.out.println(list);
        //addAll(int index,Collection element):从索引为index处开始插入另一个集合的所有元素
        list.addAll(1,Arrays.asList("addAll1()","addAll2()"));
        System.out.println(list);
        //get(int index):获取指定索引位置的元素
        System.out.println(list.get(3));
        //indexOf(Object obj):返回obj在集合中首次出现的索引位置，若不存在返回-1
        System.out.println(list.indexOf("OTS"));
        //lastIndexOf(Object obj):返回obj在集合中最后出现的索引位置，若不存在返回-1
        list.add("ABC");
        System.out.println(list);
        System.out.println(list.lastIndexOf("ABC"));
        //remove(int index):移除指定索引处的元素,并返回移除的元素
        System.out.println(list.remove(3));
        System.out.println(list);
        //set(int index,Object element):设置指定索引处的元素为element
        list.set(0,789);
        System.out.println(list);
        //subList(int fromIndex,int toIndex):返回索引从fromIndex到toIndex-1处的所有元素集合
        System.out.println(list.subList(3,5));
    }
}
