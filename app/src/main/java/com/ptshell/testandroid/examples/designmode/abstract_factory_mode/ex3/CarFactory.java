package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex3;

public abstract class CarFactory {
    //轮胎
    public abstract ITire createTire();

    //发动机
    public abstract IEngine createEngine();

    //制动系统
    public abstract IBrake createBrake();  //返回 制动系统 对象
}