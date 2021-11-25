package com.ptshell.testandroid.examples.designmode.bridging_mode.ex1;

public class Coder extends Person {

    @Override
    protected void dress() {
        System.out.println("程序员穿上" + mClothes.getName());
    }
}