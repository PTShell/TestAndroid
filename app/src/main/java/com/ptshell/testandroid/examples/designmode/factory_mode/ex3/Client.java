package com.ptshell.testandroid.examples.designmode.factory_mode.ex3;

public class Client {
    public static void main(String[] args) {
//构造一个汽车的工厂对象
        AudiFactory factory = new AudiCarFactory();

//生产Q3并启动
        AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();

//生产Q5并启动
        AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();

//生产Q7并启动
        AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();
    }
}