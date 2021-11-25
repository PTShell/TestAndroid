package com.ptshell.testandroid.examples.designmode.decoration_mode.ex2;

// 装饰者具体实现类
public class ConcreteDecoratorA extends Decorator {
    protected ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    public void operateA() {
        // 自定义的装饰方法 A      
        // 装饰方法逻辑  
    }

    public void operateB() {
        // 自定义的装饰方法 B      
        // 装饰方法逻辑   
    }
}