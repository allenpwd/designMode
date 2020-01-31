package pwd.allen.strategy;

/**
 * @author lenovo
 * @create 2020-01-31 17:05
 **/
public class JDPayment extends Payment {
    public String getName() {
        return "京东白条";
    }

    public double queryBalance(String uid) {
        return 300;
    }
}
