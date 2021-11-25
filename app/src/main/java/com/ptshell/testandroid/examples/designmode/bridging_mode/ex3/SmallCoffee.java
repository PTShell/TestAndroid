package com.ptshell.testandroid.examples.designmode.bridging_mode.ex3;

public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAddttives addttives) {
        super(addttives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + addttives.addSomething() + "咖啡");
    }
}