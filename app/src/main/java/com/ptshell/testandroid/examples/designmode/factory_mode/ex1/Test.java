package com.ptshell.testandroid.examples.designmode.factory_mode.ex1;

public class Test {
    public void test() {
        //产品A
        Factory factoryA = new FactoryA();
        Product productA = factoryA.create();
        productA.show();
        //产品B
        Factory factoryB = new FactoryB();
        Product productB = factoryB.create();
        productB.show();
    }
}
