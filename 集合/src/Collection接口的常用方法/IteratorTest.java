package Collection接口的常用方法;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/26 16:43
 */
public class IteratorTest {

    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry",31));
        collection.add(123);
        collection.add(new Date());
        collection.add(new String("xxx"));
        Iterator iterator = collection.iterator();
        //hasNext():判断是否还有下一个元素
        while (iterator.hasNext()){
            //next():指针下移,并将下移后所在集合上的位置的元素返回
            Object next = iterator.next();
            if("xxx".equals(next)){
                iterator.remove();//remove():如果元素为xxx,则移除该集合中为xxx的元素
            }else{
                System.out.println(next);
            }
        }
    }
}
