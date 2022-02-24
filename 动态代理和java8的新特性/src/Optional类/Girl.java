package Optional类;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/17 16:23
 */
public class Girl {
    private String name;

    public Girl(){

    }

    public Girl(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
