package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex1;

public class Landlord extends Person {//房东者类，继承Person

    public Landlord(HouseMediator houseMediator) {
        super(houseMediator);
    }

    @Override
    public void send(String message) {
        System.out.println("房东发布信息：" + message);
        houseMediator.notice(this, message);
    }

    @Override
    public void getNotice(String message) {
        System.out.println("房东收到消息：" + message);
    }
}