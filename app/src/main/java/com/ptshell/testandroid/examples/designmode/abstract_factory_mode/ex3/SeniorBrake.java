package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex3;

public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}