package 对象流序列化和反序列化;

import org.junit.Test;

import java.io.*;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/2 17:20
 */
public class ObjectInputOutputStream {

    //序列化过程:将内存中的java对象保存到磁盘中或者通过网络传输出去,使用ObjectOutputStream实现
    @Test
    public void test() throws Exception {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));
        objectOutputStream.writeObject(new String("Serializable"));
        objectOutputStream.flush();//刷新操作
        objectOutputStream.writeObject(new Person("Lucy",30));
        objectOutputStream.flush();//刷新操作
        objectOutputStream.close();
    }

    //反序列化过程:将磁盘文件中的对象还原为内存中的一个java对象,使用ObjectInputStream实现
    @Test
    public void test2(){
        ObjectInputStream ObjectInputStream=null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.dat"));
            Object object = objectInputStream.readObject();
            System.out.println(object);
            Object object1 = objectInputStream.readObject();
            System.out.println(object1);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            if(ObjectInputStream!=null){
                try {
                    ObjectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
