package com.ptshell.testandroid.examples.designmode.observer_mode.ex1;

/**
 * 实现抽象观察者中的方法，这里创建两个类，一个男孩类和一个女孩类，定义他们收到通知后的反应：
 */
public class Boy implements Observer {

    private String name;//名字

    public Boy(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {//男孩的具体反应
        System.out.println(name + ",收到了信息:" + message + "屁颠颠的去取快递.");
    }
}