package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex2;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}