package com.ptshell.testandroid.examples.designmode.state_mode.ex1;

//开机状态下
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一个");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一个");
    }

    @Override
    public void turnUp() {
        System.out.println("调大");
    }

    @Override
    public void turnDown() {
        System.out.println("调小");
    }
}