package pwd.allen.chainOfResponsibility.impl;

import pwd.allen.chainOfResponsibility.Handler;
import pwd.allen.chainOfResponsibility.Request;

/**
 * @author 门那粒沙
 * @create 2019-05-22 23:04
 **/
public class ActualHandler extends Handler {

    @Override
    public void execute(Request request) {
        //直接执行请求
        request.doSomething();
    }
}
