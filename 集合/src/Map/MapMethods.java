package Map;

import org.junit.Test;

import java.util.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/1 16:14
 */
public class MapMethods {

    @Test
    public void test(){
        Map map = new HashMap<>();
        map.put("AA",123);  //put():添加数据,若key相同,则新数据会替换旧的数据
        map.put("AA",456);
        map.put("BB",123);
        map.put(12,34);
        System.out.println(map);
        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("BB",456);
        map.putAll(map1);   //putAll():将map1中的所有key-value存入到map中
        System.out.println(map);
        System.out.println(map.remove("CC"));//remove():将指定的key的key-value删除，并返回删除的key的value,若key不存在则返回null
        System.out.println(map.get(12));//get():按照指定的key查找并返回对应的value,若key不存在则返回null
        System.out.println(map.containsKey("AA"));//containsKey():判断map中是否有指定的key,存在则返回true
        System.out.println(map.containsValue(456));//containsValue():判断map中是否有指定的value,存在则返回true
        map.clear();//clear():将map中的数据清空  ,不等于map=null操作
        System.out.println(map.size());//size():返回map中key-value的个数
        System.out.println(map.isEmpty());//isEmpty():判断map是否为空
    }

    @Test
    public void test2(){
        Map map = new HashMap<>();
        map.put("AA",123);
        map.put("AA",456);
        map.put("BB",123);
        map.put(12,34);
        //方式一:遍历所有的key集:keySet()
        Set set = map.keySet();
        Iterator iterable = set.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
        System.out.println("--------------------");
        //方式二:遍历所有的value集:values()
        Collection values = map.values();
        for(Object object : values){
            System.out.println(object);
        }
        System.out.println("--------------------");
        //方式三:遍历所有的key-value:entrySet()
        Set set1 = map.entrySet();
        Iterator iterable1 = set1.iterator();
        while (iterable1.hasNext()){
            System.out.println(iterable1.next());
        }

    }
}
