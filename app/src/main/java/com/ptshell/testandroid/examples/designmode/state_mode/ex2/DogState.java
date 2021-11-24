package com.ptshell.testandroid.examples.designmode.state_mode.ex2;

public class DogState implements PersonState {//单身狗状态

    @Override
    public void movies() {
        System.out.println("一个人偷偷看岛国大片");
    }

    @Override
    public void shopping() {
        //单身狗逛条毛街啊
        //空实现
    }
}