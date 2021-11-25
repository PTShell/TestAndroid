package com.ptshell.testandroid.examples.designmode.enjoy_yuan_mode.ex1;

public class Client {
    public void test() {
        BikeFactory factory = new BikeFactory();
        IBike ofo = factory.getBike("ofo");
        ofo.billing(2);
        IBike mobike = factory.getBike("Mobike");
        mobike.billing(1);
        IBike ofo1 = factory.getBike("ofo");
        ofo1.billing(3);
    }
}
