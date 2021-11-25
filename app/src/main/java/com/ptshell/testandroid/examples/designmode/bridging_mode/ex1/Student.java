package com.ptshell.testandroid.examples.designmode.bridging_mode.ex1;

public class Student extends Person {

    @Override
    protected void dress() {
        System.out.println("学生穿上" + mClothes.getName());
    }
}