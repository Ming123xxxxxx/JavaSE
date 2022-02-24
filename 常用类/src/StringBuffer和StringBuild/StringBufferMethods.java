package StringBuffer和StringBuild;

import org.junit.Test;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/22 16:21
 */
public class StringBufferMethods {

    @Test
    public void test(){
        StringBuffer stringBuffer = new StringBuffer("abcdef");
        //append():在此字符串基础上拼接字符串
        stringBuffer.append(1);
        stringBuffer.append("1");
        System.out.println("append()--:"+stringBuffer);
        //delete():删除索引从5到7的字符串
        stringBuffer.delete(5,7);
        System.out.println("delete()--:"+stringBuffer);
        //replace():将索引从3到5的字符串替换为"中国"
        stringBuffer.replace(3,5,"中国");
        System.out.println("replace()--:"+stringBuffer);
        //insert():从索引从3中插入为"美国"
        stringBuffer.insert(3,"美国");
        System.out.println("insert()--:"+stringBuffer);
        //reverse():将此字符串序列逆转
        stringBuffer.reverse();
        System.out.println("reverse()--:"+stringBuffer);
        //substring():将当前字符串从索引1到3的字符串返回给新的字符串,本身不变
        String substring = stringBuffer.substring(1, 3);
        System.out.println("substring()--:"+stringBuffer);
        System.out.println("substring()--:"+substring);
    }
}
