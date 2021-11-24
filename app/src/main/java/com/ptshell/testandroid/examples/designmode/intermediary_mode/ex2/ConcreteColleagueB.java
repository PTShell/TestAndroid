package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex2;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ConcreteColleagueB将信息交给中介者处理");
    }
}