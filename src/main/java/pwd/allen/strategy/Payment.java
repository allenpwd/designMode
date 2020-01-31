package pwd.allen.strategy;

/**
 * @author lenovo
 * @create 2020-01-31 16:46
 **/
public abstract class Payment {

    /**
     * 支付类型
     * @return
     */
    public abstract String getName();

    /**
     * 查询余额
     * @param uid
     * @return
     */
    public abstract double queryBalance(String uid);

    /**
     * 扣款支付
     * @param uid
     * @param amount
     * @return
     */
    public PayState pay(String uid, double amount) {
        if (queryBalance(uid) < amount) return new PayState(500, "支付失败", "余额不足");
        return new PayState(200, "支付成功", "支付金额：" + amount);
    }

}
