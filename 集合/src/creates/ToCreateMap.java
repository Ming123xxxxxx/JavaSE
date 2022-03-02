package creates;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/1 15:45
 */
public class ToCreateMap {

    Object[] objects;//定义一个数组
    private int length = 16;

    public int customhashcode(Object obj) {
        int hashcode = 0;

        if (obj instanceof String) {
            char[] chars = ((String) obj).toCharArray();
            for (char c : chars) {
                hashcode=hashcode+(int)c;
            }
            return hashcode%objects.length;
        }else if(obj instanceof Integer){
            hashcode=(int)obj;
            return hashcode%objects.length;
        }else{

        }

        return 0;
    }

    @Test
    public void put() {

        Person tom = new Person("Tom", 31);
        System.out.println("afwa".toString());
        System.out.println(tom.toString().substring(tom.toString().indexOf("@") + 1));
        System.out.println(new Books());
        System.out.println((int)'a');
        System.out.println(new Object[20].length);
        System.out.println((int)12131.001210);
        System.out.println((int)12131.00121412311210);
    }

    @Test
    public void test2() {

        try {
            System.out.println((Integer.parseInt("1241")));
            System.out.println("pppp)");
        } catch (NumberFormatException e) {
            System.out.println("Xxxxx");

        }

//    public Boolean ppl(Object object){
//        return null;
//    }

    }
}
