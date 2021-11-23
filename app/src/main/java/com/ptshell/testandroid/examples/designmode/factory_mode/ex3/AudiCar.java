package com.ptshell.testandroid.examples.designmode.factory_mode.ex3;

//汽车的抽象产品类
public abstract class AudiCar {
    //定义汽车的一个行为方法，车可以启动开走
    public abstract void drive();

    //定义汽车的一个行为方法，车可以自动巡航
    public abstract void selfNavigation();
}