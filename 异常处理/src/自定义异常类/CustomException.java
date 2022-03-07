package 自定义异常类;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/7 15:59
 */
//1.继承于现有的异常结构  RuntimeException/Exception
public class CustomException extends RuntimeException {
    //2.定义一个序列号:serialVersionUID
    static final long serialVersionUID = -7034895766939L;

    //3.提供重载的构造器
    public CustomException(){

    }

    //3.提供重载的构造器
    public CustomException(String msg){
       super(msg);
    }

}

class ToTest{
    //测试
    public static void main(String[] args) {
        throw new CustomException("不能输入负数");
    }
}
