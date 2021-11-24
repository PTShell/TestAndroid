package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex3;

public abstract class Postman {//快递员抽象类
    protected Postman nextPostman;//下一个快递员

    public abstract void handleCourier(String address);//派送快递
}