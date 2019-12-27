package pwd.allen.observer.impl;

import pwd.allen.observer.Observable;
import pwd.allen.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lenovo
 * @create 2019-12-27 11:19
 **/
public class MyObservable implements Observable<String> {

    private List<Observer<String>> list = new ArrayList<Observer<String>>();

    public void registerObserver(Observer<String> observer) {
        list.add(observer);
    }

    public void removeObserver(Observer<String> observer) {
        list.remove(observer);
    }

    public void notifyObservers(String msg) {
        for (Observer<String> observer : list) {
            observer.update(msg);
        }
    }
}
