package com.ptshell.testandroid.examples.designmode.strategy_mode.ex2;

public class EattingStrategy implements ChaseStragety {

    @Override
    public void chase() {
        System.out.println("一起吃饭咯~");
    }
}