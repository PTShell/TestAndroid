package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex2;

public abstract class Mediator {
    public ConcreteColleagueA colleagueA;//具体同事类
    public ConcreteColleagueB colleagueB;//具体同事类

    public void setConcreteColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public abstract void method();//抽象中介方法。由子类实现。
}