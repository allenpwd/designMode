package pwd.allen.observer;

/**
 * 抽象观察者
 *
 * @author lenovo
 * @create 2019-12-27 10:32
 **/
public interface Observer<T> {

    /**
     * 如果把自己注册/订阅给Observable，Observable发送通知时会触发观察者的update方法
     * @param t
     */
    public void update(T t);
}
