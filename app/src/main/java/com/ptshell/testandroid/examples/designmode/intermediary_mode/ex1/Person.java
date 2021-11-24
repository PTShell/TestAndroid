package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex1;

public abstract class Person {//人物类
    protected HouseMediator houseMediator;

    public Person(HouseMediator houseMediator) {
        this.houseMediator = houseMediator;//获取中介
    }

    public abstract void send(String message);//发布信息

    public abstract void getNotice(String message);//接受信息
}