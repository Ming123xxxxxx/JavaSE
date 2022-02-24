package Optional类;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/17 16:26
 */

//Optional类:为了在程序中避免出现空指针而创建的
/*
* 常用方法:
*
*
* */
public class OptionalTest {

    @Test
    public void test(){
        Girl girl = new Girl();
        girl=null;
        //of(T t):保证t是非空的
        Optional<Girl> girl1 = Optional.of(girl);
    }

    @Test
    public void test2(){
        Girl girl = new Girl();
        girl=null;
        //ofNullable(T t):t可以为null
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        System.out.println(girl1);
        //orElse(T t1):如果当前的Optional内部封装的t是非空的,则返回内部的t
        //如果内部的t1是空的,则返回orElse()方法中的参数t1
        Girl girl2 = girl1.orElse(new Girl("xx"));
        System.out.println(girl2);
    }

    //优化以后的getGirlname()
    public String getGirlname(Boy boy){
       if(boy!=null){
           if(boy.getGirl()!=null){
               return boy.getGirl().getName();
           }
       }
        return null;
    }

    //使用Optional类后的getGirlname1()
    public String getGirlname1(Boy boy){

        Optional<Boy> boy1 = Optional.ofNullable(boy);
        //此时pp一定非空
        Boy pp = boy1.orElse(new Boy(new Girl("pp")));

        Girl girl = pp.getGirl();
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        //此时gilr2一定非空
        Girl girl2 = girl1.orElse(new Girl("ll"));
        return girl2.getName();

    }

    @Test
    public void test3(){
        Boy boy = new Boy();
        String gilrname = getGirlname(boy);
        System.out.println(gilrname);
    }

    @Test
    public void  test4(){
        Boy boy=null;
        boy=new Boy();
        boy=new Boy(new Girl("ooo"));
        String gn = getGirlname1(boy);
        System.out.println(gn);
    }




}
