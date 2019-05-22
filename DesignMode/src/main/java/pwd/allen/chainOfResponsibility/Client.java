package pwd.allen.chainOfResponsibility;

import pwd.allen.chainOfResponsibility.impl.ActualHandler;
import pwd.allen.chainOfResponsibility.impl.HandlerA;
import pwd.allen.chainOfResponsibility.impl.HandlerB;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 门那粒沙
 * @create 2019-05-22 23:09
 **/
public class Client {
    public static void main(String[] args) {
        //创建第一个请求处理者集合
        List<Handler> handlers = new ArrayList<Handler>();

        //添加请求处理者到集合中
        handlers.add(new HandlerA());
        handlers.add(new HandlerB());
        //将最终的处理者添加到集合中
        handlers.add(new ActualHandler());

        //处理集合中的请求处理者,按集合的顺序为它们设置下一任请求处理者,并返回第一任处理人
        Handler first = setNext(handlers);
        //第一任处理者开始处理请求
        first.execute(new Request());

    }

    //按照集合的顺序,设置下一任处理者,并返回第一任处理者
    static Handler setNext(List<Handler> handlers) {
        for (int i = 0; i < handlers.size() -1; i++) {
            Handler handler = handlers.get(i);
            Handler next = handlers.get(i + 1);
            handler.setNext(next);
        }
        return handlers.get(0);
    }
}
