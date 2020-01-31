package pwd.allen.strategy;

/**
 * @author lenovo
 * @create 2020-01-31 17:03
 **/
public class AliPayment extends Payment {
    public String getName() {
        return "支付宝";
    }

    public double queryBalance(String uid) {
        return 100;
    }
}
