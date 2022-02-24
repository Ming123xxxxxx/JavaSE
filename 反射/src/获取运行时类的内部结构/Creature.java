package 获取运行时类的内部结构;

import java.io.Serializable;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/19 15:10
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
