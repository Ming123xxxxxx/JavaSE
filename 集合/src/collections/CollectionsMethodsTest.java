package collections;

import org.junit.Test;

import java.util.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/2 16:34
 */
public class CollectionsMethodsTest {


    @Test
    public void test(){
        Map map = new HashMap();

    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(789);
        list.add(456);
        list.add(012);
        System.out.println(list);
        Collections.sort(list);//sort(List):按照自然排序,对List集合元素进行升序排序
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {//sort(List,Comparator):按照定制排序,对List集合元素进行排序
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1-02;
            }
        });
        System.out.println(list);
        Collections.swap(list,1,3);//swap():将List集合中索引处为1的元素和3的元素位置互换
        System.out.println(list);
        Collections.reverse(list);//reverse(List):反转List集合中的元素的排序
        System.out.println(list);
        Collections.shuffle(list);//shuffle(List):对List集合中的元素进行随机排序
        System.out.println(list);
        System.out.println(Collections.frequency(list,789));;//frequency(Collection,Object):获取集合中Object出现的频率
    }
}
