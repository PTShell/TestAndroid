package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex3;

public class BeijingPostman extends Postman {//北京快递员

    @Override
    public void handleCourier(String address) {
        if (address.equals("Beijing")) {//北京地区的则派送
            System.out.println("派送到北京");
            return;
        } else {//否则交给下一个快递员去处理
            nextPostman.handleCourier(address);
        }
    }
}