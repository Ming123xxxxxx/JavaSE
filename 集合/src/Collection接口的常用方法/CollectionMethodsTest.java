package Collection接口的常用方法;

import org.junit.Test;

import java.util.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/26 15:25
 */
public class CollectionMethodsTest {

    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(new Person("Tom",31));  //aad():将元素添加到集合中
        coll.add(123);
        coll.add(new Date());
        System.out.println(coll.size());//size():获取添加的元素的个数
        Collection collection = new ArrayList();
        collection.add("CC");
        collection.add(789);
        coll.addAll(collection);//addAll()将collection中的数据添加到当前的集合中
        System.out.println(coll);
        System.out.println(coll.contains("CC"));//contain():判断当前集合中是否包含"CC"
        //contain():判断当前集合中是否包含name="Tom"且ag=31的Person对象(在Person中重写了hashCode()和equals()的前提下)
        System.out.println(coll.contains(new Person("Tom",31)));
        System.out.println(coll.containsAll(collection));//containsAll():判断coll是否包含collection的全部数据
        coll.remove(123);//remove():移除该集合中为123的数据
        System.out.println(coll);
        coll.removeAll(collection);//removeAll():移除coll中的collection也存在的所有数据
        System.out.println(coll);
        Collection collect =new ArrayList();
        collect.add(new Person("Tom",31));
        collect.add("51123");
        coll.retainAll(collect);//retainall():判断coll中是否包含collect中的值,并将包含的值保存在coll中
        System.out.println(coll);
        collect.remove("51123");
        System.out.println(coll.equals(collect));//equals():判断coll中的内容是否和collect的内容相同
        System.out.println(coll.hashCode());///hashCode():返回当前集合的哈希值
        Object[] objects = coll.toArray();//将集合转换为数组
        System.out.println(objects[0]);
        List<String> list = Arrays.asList(new String[]{"AA", "123"});//将数组转化为集合,打印结果  [AA, 123]
        List list1 = Arrays.asList(new int[]{123,456});//将数组转化为集合 ,打印结果  [[I@573fd745]
        List list2 = Arrays.asList(new Integer[]{123, 456});//将数组转化为集合,打印结果  [123, 456]
        //iterator():返回Iterator接口的实例,用于遍历集合元素
        coll.clear();//clear():清空集合中的元素
        System.out.println(coll.isEmpty());//isEmpty():判断当前集合是否为空,
    }

}
