package com.ptshell.testandroid.examples.designmode.builder_mode.ex2;

public class BMWX6Car extends BMWCar{
    protected BMWX6Car(){

    }

    // 抽象为X6区别就是发动机等主要机械组件不一样
    @Override
    public void setEngineAndOthers() {
        mEngineAndOthers = "宝马X6专用发动机";
    }
}