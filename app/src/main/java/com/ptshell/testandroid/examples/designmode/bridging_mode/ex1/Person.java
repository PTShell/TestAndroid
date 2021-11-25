package com.ptshell.testandroid.examples.designmode.bridging_mode.ex1;

public abstract class Person {
    Clothes mClothes;//持有衣服类的引用

    public void setClothes(Clothes clothes) {
        mClothes = clothes;
    }

    protected abstract void dress();//穿衣服
}