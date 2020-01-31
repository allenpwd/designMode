package pwd.allen.strategy;

/**
 * @author lenovo
 * @create 2020-01-31 17:04
 **/
public class WechatPayment extends Payment {
    public String getName() {
        return "微信支付";
    }

    public double queryBalance(String uid) {
        return 200;
    }
}
