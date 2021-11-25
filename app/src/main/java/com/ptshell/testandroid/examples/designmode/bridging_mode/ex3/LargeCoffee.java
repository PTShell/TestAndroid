package com.ptshell.testandroid.examples.designmode.bridging_mode.ex3;

public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAddttives addttives) {
        super(addttives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + addttives.addSomething() + "咖啡");
    }
}