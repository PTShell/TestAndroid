package com.ptshell.testandroid.examples.designmode.bridging_mode.ex3;

public abstract class Coffee {
    protected CoffeeAddttives addttives;

    public Coffee(CoffeeAddttives addttives) {
        super();
        this.addttives = addttives;
    }

    public abstract void makeCoffee();
}