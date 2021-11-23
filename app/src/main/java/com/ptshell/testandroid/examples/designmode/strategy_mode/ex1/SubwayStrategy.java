package com.ptshell.testandroid.examples.designmode.strategy_mode.ex1;

public class SubwayStrategy implements CalculatorStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km < 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        return 7;//其他简化为7
    }
}