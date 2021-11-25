package com.ptshell.testandroid.examples.designmode.bridging_mode.ex2;

// 抽象部分
public abstract class Abstraction {
    // 声明一私有成员变量引用实现部分的对象   
    private Implementor mImplementor;

    /**
     * 通过实现部分对象的引用构造抽象部分的对象  *
     *
     * @param implementor 实现部分对象的引用
     */
    public Abstraction(Implementor implementor) {
        mImplementor = implementor;
    }

    /**
     * 通过调用实现部分具体的方法实现具体的功能
     */
    public void operation() {
        mImplementor.operationImpl();
    }
}