package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex3;

public class ShanghaiPostman extends Postman {//上海快递员

    @Override
    public void handleCourier(String address) {
        if (address.equals("Shanghai")) {
            System.out.println("派送到上海");
            return;
        } else {
            nextPostman.handleCourier(address);
        }
    }
}
