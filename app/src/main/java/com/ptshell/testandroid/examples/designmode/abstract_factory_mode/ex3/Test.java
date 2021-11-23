package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex3;

public class Test {
    private void test() {
        //构造一个生产Q3 的工厂
        CarFactory factoryQ3 = new Q3Factory();
        factoryQ3.createTire().tire();
        factoryQ3.createEngine().engine();
        factoryQ3.createBrake().brake();

        //构造一个 生产Q7 的 工厂
        CarFactory factoryQ7 = new Q7Factory();
        factoryQ7.createTire().tire();
        factoryQ7.createEngine().engine();
        factoryQ7.createBrake().brake();
    }
}
