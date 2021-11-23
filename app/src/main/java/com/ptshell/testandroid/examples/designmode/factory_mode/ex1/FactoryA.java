package com.ptshell.testandroid.examples.designmode.factory_mode.ex1;

//具体工厂类A 创建具体工厂类，继承抽象工厂类，实现创建具体的产品：
public class FactoryA extends Factory {
    @Override
    public Product create() {
        return new ProductA();//创建ProductA
    }
}