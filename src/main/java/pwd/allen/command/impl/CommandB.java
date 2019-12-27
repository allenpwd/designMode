package pwd.allen.command.impl;

import pwd.allen.command.Command;
import pwd.allen.command.CommandReceiver;

/**
 * @author 门那粒沙
 * @create 2019-05-22 21:40
 **/
public class CommandB implements Command {

    private CommandReceiver receiver;

    public CommandB(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.doSomethingB();
    }
}
