package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex2;

/**
 * 具体的同事：
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ConcreteColleagueA 将信息交给中介者处理");
    }
}