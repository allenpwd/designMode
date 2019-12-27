package pwd.allen.observer;

import pwd.allen.observer.impl.MyObservable;
import pwd.allen.observer.impl.MyObserver;

/**
 * @author lenovo
 * @create 2019-12-27 10:13
 **/
public class Main {
    public static void main(String[] args) {

        //创建被观察者
        MyObservable observable = new MyObservable();

        //创建观察者
        MyObserver myObserver1 = new MyObserver("观察者一号");
        MyObserver myObserver2 = new MyObserver("观察者二号");

        observable.registerObserver(myObserver1);
        observable.registerObserver(myObserver2);

        observable.notifyObservers("一给我里giaogiao！");

        observable.notifyObservers("加油！奥利给！");
    }
}
