package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex3;

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}