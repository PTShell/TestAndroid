package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex3;

public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire(); //返回SUV 车胎
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngin(); //返回进口轮胎
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake(); //返回高级制动
    }
}