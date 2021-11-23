package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex3;

public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();    //返回普通的轮胎类
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngin(); //返回国产发动机
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake(); //返回一般制动
    }
}