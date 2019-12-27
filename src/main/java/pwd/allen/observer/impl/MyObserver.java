package pwd.allen.observer.impl;

import pwd.allen.observer.Observer;

/**
 * @author lenovo
 * @create 2019-12-27 11:23
 **/
public class MyObserver implements Observer<String> {

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    public void update(String s) {
        System.out.println(String.format("我是%s,我接收到了通知：%s", name, s));
    }
}
