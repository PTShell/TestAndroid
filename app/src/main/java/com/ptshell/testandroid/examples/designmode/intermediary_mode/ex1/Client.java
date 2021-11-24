package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex1;

public class Client {
    public void test() {
        Lianjia houseMediator = new Lianjia();
        Purchaser purchaser = new Purchaser(houseMediator);
        Landlord landlord = new Landlord(houseMediator);
        houseMediator.setLandlord(landlord);
        houseMediator.setPurchaser(purchaser);

        landlord.send("出售一套别墅");
        System.out.println("------------------------");
        purchaser.send("求购一套学区房");
    }
}
