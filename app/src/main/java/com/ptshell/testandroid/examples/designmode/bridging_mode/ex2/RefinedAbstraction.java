package com.ptshell.testandroid.examples.designmode.bridging_mode.ex2;

// 优化的抽象部分
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 对 Abstraction 中的方法进行扩展
     */
    public void refinedOperation() {
        // 忽略实现逻辑
    }
}