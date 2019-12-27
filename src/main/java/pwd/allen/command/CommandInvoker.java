package pwd.allen.command;

/**
 * 命令请求者/调用者
 * 持有命令对象，在需要时通过命令对象触发命令操作完成具体业务逻辑
 *
 * @author 门那粒沙
 * @create 2019-05-22 17:01
 **/
public class CommandInvoker {

    private Command command;

    /**
     * 设置具体命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void doCommand() {
        command.execute();
    }
}
