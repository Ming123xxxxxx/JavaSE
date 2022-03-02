package creates;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/1 15:43
 */
public class Books {

    private String name;
    private String author;
    private int money;

    public Books() {
    }

    public Books(String name, String author, int money) {
        this.name = name;
        this.author = author;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
