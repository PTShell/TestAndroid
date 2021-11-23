package com.ptshell.testandroid.examples.designmode.factory_mode.ex1;

//具体产品类B 创建具体产品类，继承Product类：
public class ProductB extends Product {
    @Override
    public void show() {
        System.out.println("product B");
    }
}