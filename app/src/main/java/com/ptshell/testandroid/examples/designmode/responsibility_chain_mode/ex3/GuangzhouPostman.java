package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex3;

public class GuangzhouPostman extends Postman {//广州快递员

    @Override
    public void handleCourier(String address) {
        if (address.equals("Guangzhou")) {
            System.out.println("派送到广州");
            return;
        } else {
            if (nextPostman != null)
                nextPostman.handleCourier(address);
        }
    }
}