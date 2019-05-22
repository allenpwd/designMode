package pwd.allen.command;

import pwd.allen.command.impl.CommandA;
import pwd.allen.command.impl.CommandB;
import pwd.allen.command.impl.CommandReceiverImpl;

/**
 * @author 门那粒沙
 * @create 2019-05-22 21:43
 **/
public class Client {

    public static void main(String[] args) {
        //创建命令执行者
        CommandExecutor executor = new CommandExecutor();

        //创建命令接受者
        CommandReceiver receiver = new CommandReceiverImpl();

        //创建命令A，交由命令执行者执行
        Command commandA = new CommandA(receiver);
        executor.setCommand(commandA);
        executor.doCommand();

        //创建命令B，交由命令执行者执行
        Command commandB = new CommandB(receiver);
        executor.setCommand(commandB);
        executor.doCommand();
    }
}
