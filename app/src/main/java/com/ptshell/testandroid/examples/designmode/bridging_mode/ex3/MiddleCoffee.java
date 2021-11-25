package com.ptshell.testandroid.examples.designmode.bridging_mode.ex3;

public class MiddleCoffee extends Coffee {
    public MiddleCoffee(CoffeeAddttives addttives) {
        super(addttives);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void makeCoffee() {
        System.out.println("中杯的" + addttives.addSomething() + "咖啡");
    }
}