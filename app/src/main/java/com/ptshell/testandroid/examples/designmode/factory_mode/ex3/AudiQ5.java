package com.ptshell.testandroid.examples.designmode.factory_mode.ex3;

public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5启动了");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5开始自动巡航");
    }
}