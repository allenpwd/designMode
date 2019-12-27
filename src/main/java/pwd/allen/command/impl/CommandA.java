package pwd.allen.command.impl;

import pwd.allen.command.Command;
import pwd.allen.command.CommandReceiver;

/**
 * 绑定命令与接收者
 *
 * @author 门那粒沙
 * @create 2019-05-22 21:40
 **/
public class CommandA implements Command {

    private CommandReceiver receiver;

    public CommandA(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.doSomethingA();
    }
}
