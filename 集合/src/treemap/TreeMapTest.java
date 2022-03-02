package treemap;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/2 16:04
 */
public class TreeMapTest {

    //向TreeMap中添加key-value,要求key必须是由同一个类创建的对象
    //因为要按照key进行排序:自然排序,定制排序
    //自然排序
    @Test
    public void test(){
        TreeMap map = new TreeMap();
        map.put(new Person("马云",61),"阿里巴巴");
        map.put(new Person("马化腾",54),"腾讯");
        map.put(new Person("刘强东",49),"京东");
        map.put(new Person("Bill Gates",61),"微软");
        map.put(new Person("李彦宏",41),"百度");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //定制排序
    @Test
    public void test2(){
        Comparator comparable = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().length()>o2.getName().length()){
                    return -o1.getName().length()-o2.getName().length();
                }else{
                    return -o1.getAge()-o2.getAge();
                }
            }
        };

        TreeMap map = new TreeMap(comparable);
        map.put(new Person("马云",61),"阿里巴巴");
        map.put(new Person("马化腾",54),"腾讯");
        map.put(new Person("刘强东",49),"京东");
        map.put(new Person("Bill Gates",61),"微软");
        map.put(new Person("李彦宏",41),"百度");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
