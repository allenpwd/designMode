package pwd.allen.command;

/**
 * 命令接收者，处理具体业务逻辑
 *
 * @author 门那粒沙
 * @create 2019-05-22 16:58
 **/
public interface CommandReceiver {
    /**
     * 命令执行者方法A
     */
    void doSomethingA();

    /**
     * 命令执行者方法B
     */
    void doSomethingB();
}
