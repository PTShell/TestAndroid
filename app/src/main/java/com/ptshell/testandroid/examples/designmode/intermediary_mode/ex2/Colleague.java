package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex2;

/**
 * 抽象的同事：
 */
public abstract class Colleague {
    public Mediator mediator;//中介者对象

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void action();
}