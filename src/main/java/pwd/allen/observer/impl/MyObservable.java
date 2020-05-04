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

    @Override
    public void registerObserver(Observer<String> observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer<String> observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (Observer<String> observer : list) {
            observer.update(msg);
        }
    }
}
