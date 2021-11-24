package com.ptshell.testandroid.examples.designmode.state_mode.ex1;

//关机状态下什么都做不了。
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
    }

    @Override
    public void prevChannel() {
    }

    @Override
    public void turnUp() {
    }

    @Override
    public void turnDown() {
    }
}