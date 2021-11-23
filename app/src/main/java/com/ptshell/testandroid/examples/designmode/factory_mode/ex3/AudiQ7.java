package com.ptshell.testandroid.examples.designmode.factory_mode.ex3;

public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q7启动了");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7开始自动巡航");
    }
}