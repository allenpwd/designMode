package pwd.allen.command;

import pwd.allen.command.impl.CommandReceiverImpl;

/**
 * @author 门那粒沙
 * @create 2019-05-22 17:01
 **/
public class CommandExecutor {

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
