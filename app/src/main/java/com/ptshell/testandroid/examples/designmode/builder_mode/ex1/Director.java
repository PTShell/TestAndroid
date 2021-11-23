package com.ptshell.testandroid.examples.designmode.builder_mode.ex1;

public class Director {
    Builder mBuilder = null;

    //@param builder
    public Director(Builder builder) {
        mBuilder = builder;
    }

    //构建对象
    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}