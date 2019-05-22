package pwd.allen.chainOfResponsibility;

/**
 * @author 门那粒沙
 * @create 2019-05-22 23:01
 **/
public abstract class Handler {

    //下一任处理者
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void execute(Request request);
}
