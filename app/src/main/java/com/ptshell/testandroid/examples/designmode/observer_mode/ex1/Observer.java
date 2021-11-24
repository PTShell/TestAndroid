package com.ptshell.testandroid.examples.designmode.observer_mode.ex1;

/**
 * 定义一个接到通知的更新方法，即收件人收到通知后的反应：
 */
public interface Observer {//抽象观察者

    public void update(String message);//更新方法
}