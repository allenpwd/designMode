package pwd.allen.chainOfResponsibility.impl;

import pwd.allen.chainOfResponsibility.Handler;
import pwd.allen.chainOfResponsibility.Request;

/**
 * @author 门那粒沙
 * @create 2019-05-22 23:04
 **/
public class HandlerB extends Handler {

    @Override
    public void execute(Request request) {
        //处理自己的事，然后交由下一任处理者处理请求
        System.out.println("请求处理者A处理请求");
        if (next != null) next.execute(request);
    }
}
