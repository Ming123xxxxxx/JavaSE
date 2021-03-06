package StreamAPI;

import org.junit.Test;
import 方法引用.Emploee;
import 方法引用.EmployeeData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/17 14:23
 */

//测试Stream的中间操作
public class StreamAPITest2 {

    //1.筛选与切片
    @Test
    public void test(){

        List<Emploee> list = EmployeeData.ferEmployees();

        //filter(Predicate p):接受Lambda,从流中排除某些元素
        Stream<Emploee> stream = list.stream();
        stream.filter(e -> e.getSalary()>60000).forEach(System.out::println);
        System.out.println("-----------------------------");
        //limit(n):截断流,使其元素不超过给定数量
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("-----------------------------");
        //skip(n):跳过元素,返回一个扔掉了前n个元素的流,若流中元素不足n个,则返回一个空流,与limit(n)互补
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("-----------------------------");
        //distinct():筛选,通过流生成元素的hashCode()和equals()去除重复元素
        for(int i=0;i<4;i++){
            list.add(new Emploee(1010,"刘强东",40,521312));
        }
        list.stream().distinct().forEach(System.out::println);
    }

    //映射
    @Test
    public void test2(){
        //map(Function f):接受一个函数作为参数,将元素转换为其他形式或提取信息,该函数会被应用到每个元素上,并将其映射成一个新的元素
        //将list中的字母转化为大写
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        //获取员工姓名长度大于2的员工姓名
        List<Emploee> list1 = EmployeeData.ferEmployees();
        Stream<String> stringStream = list1.stream().map(str -> str.getName());
        stringStream.filter(name -> name.length()>2).forEach(System.out::println);
        System.out.println("------------------------");
        //
        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest2::fromstringtistream);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });
        System.out.println("------------------------");

        //flat(Function f):接收一个函数作为参数,将流中的每个值都换成另一个流,然后把所有流连接成一个流
        Stream<Character> characterStream = list.stream().flatMap(StreamAPITest2::fromstringtistream);
        characterStream.forEach(System.out::println);
    }

    //将字符串中的多个字符构成的集合转换为对应的Stream的实例
    public static Stream<Character> fromstringtistream(String str){
        ArrayList<Character> list = new ArrayList<>();
        for(Character c:str.toCharArray()){
            list.add(c);
        }
        return list.stream();
    }

    //排序
    @Test
    public void test4(){

        //sorted():自然排序
        List<Integer> integers = Arrays.asList(12, 41, 21, 41, 51, 31, 51, 15, 61, 3);
        integers.stream().sorted().forEach(System.out::println);


        //sorted(Comparator com):定制排序
        List<Emploee> list = EmployeeData.ferEmployees();
        list.stream().sorted((s1,s2) -> Integer.compare(s1.getAge(),s2.getAge())).forEach(System.out::println);
    }
}
