package Set;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/27 17:05
 */
public class SetTest {

    @Test
    public void test(){
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add(789);
        set.add(new Person("Tom",31));
        set.add(new Person("Tom",31));
        set.add("AA");
        System.out.println(set);
    }

    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add(789);
        set.add(new Person("Tom",31));
        set.add(new Person("Tom",31));
        set.add("AA");
        System.out.println(set);
    }
}
