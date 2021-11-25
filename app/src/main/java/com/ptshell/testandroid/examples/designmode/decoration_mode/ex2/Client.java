package com.ptshell.testandroid.examples.designmode.decoration_mode.ex2;

// 客户端实现
public class Client {
    public static void main(String[] args) {
        // 构造被装饰的组件对象
        Component component = new ConcreteComponent();
        // 根据组件对象构造装饰者对象并调用，即给组件对象增加装饰者的功能方法
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operate();
    }
}