package com.ptshell.testandroid.examples.designmode.strategy_mode.ex1;

public class BusStrategy implements CalculatorStrategy {
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}