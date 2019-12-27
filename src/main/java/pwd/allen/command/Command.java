package pwd.allen.command;

/**
 * 命令
 * 作用：定义命令操作，这些操作被调用时去触发命令接收者去做具体命令对应的业务逻辑
 *
 * @author 门那粒沙
 * @create 2019-05-22 21:37
 **/
public interface Command {

    /**
     * 执行命令
     */
    void execute();
}
