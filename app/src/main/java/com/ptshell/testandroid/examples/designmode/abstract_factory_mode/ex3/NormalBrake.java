package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex3;

public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}