package Comparable和Comparator;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/24 14:38
 */
public class Books implements Comparable{
    private String BookName;
    private String Author;
    private int Price;

    public Books(){

    }

    public Books(String bookName, String author, int price) {
        BookName = bookName;
        Author = author;
        Price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", Price=" + Price +
                '}';
    }

    //指明商品比较大小的方式,按照价格从低到高排序
    @Override
    public int compareTo(Object o) {
        if(o instanceof Books){
            Books b =(Books) o;
            //方式一:
           if(this.Price>((Books) o).Price){
               return 1;
           }else if(this.Price<((Books) o).Price){
               return -1;
           }else{
               return 0;
           }
           //方式二
//            return Double.compare(this.Price,b.Price);
        }else{
            throw new RuntimeException("传入的数据类型不同");

        }
    }
}
