package com.ptshell.testandroid.examples.designmode.bridging_mode.ex3;

public class Client {
    public static void main(String[] args) {
        //准备原味
        Ordinary ordinary = new Ordinary();

        //准备糖
        Sugar sugar = new Sugar();
        //原味大杯
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();
        //加糖大杯
        largeCoffee = new LargeCoffee(sugar);
        largeCoffee.makeCoffee();

        //原味小杯
        SmallCoffee smallCoffee = new SmallCoffee(ordinary);
        smallCoffee.makeCoffee();
        //加糖小杯
        smallCoffee = new SmallCoffee(sugar);
        smallCoffee.makeCoffee();

        //原味小杯
        MiddleCoffee middleCoffee = new MiddleCoffee(ordinary);
        middleCoffee.makeCoffee();
        //加糖小杯
        middleCoffee = new MiddleCoffee(sugar);
        middleCoffee.makeCoffee();
    }
}