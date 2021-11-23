package com.ptshell.testandroid.examples.designmode.strategy_mode.ex1;

public class TranficCalculator {
    CalculatorStrategy mStrategy;

    public static void main(String[] args) {
        TranficCalculator ca = new TranficCalculator();
        //设置计算策略
        ca.setStrategy(new BusStrategy());
        //计算价格
        System.out.println("16公里公交票价：" + ca.calculatePrice(16));
    }

    public void setStrategy(CalculatorStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}