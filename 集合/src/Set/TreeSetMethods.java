package Set;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/28 15:02
 */
public class TreeSetMethods {


    @Test
    public void test(){
        TreeSet set = new TreeSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add(789);
        set.add(312);
        set.add(512);
        System.out.println(set);
    }

    //自然排序
    @Test
    public void test2(){
        TreeSet<Person> set = new TreeSet();
        set.add(new Person("成吉思汗",13));
        set.add(new Person("李白",41));
        set.add(new Person("杜甫",31));
        set.add(new Person("马可波罗",51));
        set.add(new Person("Bill",51));
        set.add(new Person("陆游",61));
        set.add(new Person("陆游",5111));
        set.add(new Person("陆游",5111));
        for(Person p :set){
            System.out.println(p.toString());
        }
    }

    //定制排序
    @Test
    public void test3(){
        Comparator<Person> comparator = (o1,o2) ->{
            //如果name相同则比较age
            if(o1.getName().equals(o2.getName())){
                return -(o1.getAge()-o2.getAge());
            }else{
            //如果name不相同则比较name的length
                return -(o1.getName().length()-o2.getName().length());
            }
        };
        TreeSet<Person> set = new TreeSet(comparator);
        set.add(new Person("成吉思汗",13));
        set.add(new Person("李白",41));
        set.add(new Person("杜甫",31));
        set.add(new Person("马可波罗",51));
        set.add(new Person("Bill",51));
        set.add(new Person("陆游",61));
        set.add(new Person("陆游",5111));
        set.add(new Person("陆游",5111));
        for(Person p :set){
            System.out.println(p.toString());
        }

    }
}
