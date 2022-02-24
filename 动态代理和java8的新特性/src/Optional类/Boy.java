package Optional类;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/2/17 16:23
 */
public class Boy {
    private Girl girl;

    public Boy() {
    }

    public Boy(Girl girl) {
        this.girl = girl;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }
}
