package com.ptshell.testandroid.examples.designmode.factory_mode.ex2;

public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product p = factory.createProduct(ConcreteProductB.class);
        p.method();
    }
}