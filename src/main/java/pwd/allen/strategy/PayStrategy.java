package pwd.allen.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付策略管理类
 * @author lenovo
 * @create 2020-01-31 17:06
 **/
public class PayStrategy {
    public static final String PAY_ALI = "ALI";
    public static final String PAY_JD = "JD";
    public static final String PAY_WECHAT = "WECHAT";
    public static final String PAY_DEFAULT = PAY_ALI;

    public static Map<String, Payment> payStrategy = new HashMap<String, Payment>();

    static {
        payStrategy.put(PAY_ALI, new AliPayment());
        payStrategy.put(PAY_JD, new JDPayment());
        payStrategy.put(PAY_WECHAT, new WechatPayment());
    }

    public static Payment get(String payKey) {
        if (!payStrategy.containsKey(payKey)) {
            return payStrategy.get(PAY_DEFAULT);
        }
        return payStrategy.get(payKey);
    }
}
