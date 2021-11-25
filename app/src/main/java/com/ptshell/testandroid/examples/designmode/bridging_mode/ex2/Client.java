package com.ptshell.testandroid.examples.designmode.bridging_mode.ex2;

// 客户端实现
public class Client {
    public static void main(String[] args) {
        RefinedAbstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();
        abstraction.refinedOperation();
    }
}