package pwd.allen.observer;

/**
 * 抽象被观察者接口
 * 定义添加、删除、通知观察者方法
 *
 * @author lenovo
 * @create 2019-12-27 10:31
 **/
public interface Observable<T> {
    /**
     * 添加观察者
     * @param observer
     */
    public void registerObserver(Observer<T> observer);
    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer<T> observer);
    /**
     * 通知观察者
     */
    public void notifyObservers(T t);
}
