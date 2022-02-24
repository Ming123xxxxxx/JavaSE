package StreamAPI;

import org.junit.Test;
import 方法引用.Emploee;
import 方法引用.EmployeeData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/17 15:18
 */

//Stream的终止操作
public class StreamAPITest3 {

    //1.匹配和查找
    @Test
    public void test(){
        List<Emploee> list = EmployeeData.ferEmployees();
        //allMatch(Predicate p):检查是否匹配所有元素
        //练习:是否所有的员工的年龄都大于18
        boolean b = list.stream().allMatch(emploee -> emploee.getAge() > 18);
        System.out.println(b);
        System.out.println("--------------");
        //anyMatch(Predicate p):检查是否至少匹配一个元素
        //练习:是否存在员工的工资大于10000
        boolean b1 = list.stream().allMatch(e -> e.getSalary() > 10000);
        System.out.println(b1);
        System.out.println("--------------");
        //noneMatch(Predicate p):检查是否没有匹配的元素
        //是否存在员工姓”雷“
        boolean b2 = list.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println(b2);
        System.out.println("--------------");

        //findFirst:返回第一个元素
        Optional<Emploee> first = list.stream().findFirst();
        System.out.println(first);
        System.out.println("--------------");

        //findAny:返回当前流中的任意元素
        Optional<Emploee> any = list.parallelStream().findAny();
        System.out.println(any);
        System.out.println("--------------");

        //count:返回流中元素的总个数
        long count = list.stream().filter(emploee -> emploee.getSalary() > 50000).count();
        System.out.println(count);
        System.out.println("--------------");

        //max(Comparator c):返回流中最大的值
        Optional<Emploee> max = list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(max);
        System.out.println("--------------");

        //min(Comparator c):返回流中最小的值
        Optional<Emploee> min = list.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(min);
        System.out.println("--------------");

        //forEach(Consumer c):内部迭代
        list.stream().forEach(System.out::println);
    }

    //归约
    @Test
    public void test2(){

        //reduce(T identity,BinaryOperator):可以将流中元素反复结合起来，得到一个值,返回T
        //练习:计算1-10的自然数的和
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer reduce = integers.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        //reduce(BinaryOperator):可以将流中元素反复结合起来，得到一个值,返回Operation<T>
        //练习:计算公司中员工工资的总和
        Stream<Double> doubleStream = EmployeeData.ferEmployees().stream().map(e -> e.getSalary());
        Optional<Double> reduce1 = doubleStream.reduce(Double::sum);
        System.out.println(reduce1);
    }

    //收集
    @Test
    public void test3(){
        //collect(Collector c):将流转换为其他形式,接收一个Controller接口的实例,用于给Stream中元素做汇总的方法
        //练习:查找工资大于50000的员工,结果返回为一个list或set

        //返回list
        List<Emploee> list = EmployeeData.ferEmployees();
        List<Emploee> collect = list.stream().filter(emploee -> emploee.getSalary() > 50000).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println();
        //返回set
        Set<Emploee> collect1 = list.stream().filter(emploee -> emploee.getSalary() > 50000).collect(Collectors.toSet());
        collect1.forEach(System.out::println);
    }
}
