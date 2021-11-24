package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex1;

public abstract class Handler {
    //下一代处理者
    public Handler nextProcessor;

    // 每一个实现类处理
    public abstract void handleRequest(String msg);
}