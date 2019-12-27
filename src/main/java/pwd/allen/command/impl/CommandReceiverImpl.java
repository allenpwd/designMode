package pwd.allen.command.impl;

import pwd.allen.command.CommandReceiver;

/**
 * @author 门那粒沙
 * @create 2019-05-22 21:42
 **/
public class CommandReceiverImpl implements CommandReceiver {
    public void doSomethingA() {
        System.out.println("命令接收人执行命令A");
    }

    public void doSomethingB() {
        System.out.println("命令接收人执行命令B");
    }
}
