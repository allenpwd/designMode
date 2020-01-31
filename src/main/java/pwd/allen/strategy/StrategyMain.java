package pwd.allen.strategy;

/**
 * @author lenovo
 * @create 2020-01-31 17:12
 **/
public class StrategyMain {

    public static void main(String[] args) {
        String uid = "pwd帐号";
        double amount = 150;

        //Payment定义支付的行为以及包装共同的逻辑，不同策略有不同行为实现，调用方通过payment实例支付，不需要知道具体支付策略
        Payment payment = null;

        String payKey = null;
        payment = PayStrategy.get(payKey);
        System.out.println(payment.pay(uid, amount));

        payKey = PayStrategy.PAY_WECHAT;
        payment = PayStrategy.get(payKey);
        System.out.println(payment.pay(uid, amount));
    }
}
