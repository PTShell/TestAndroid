package com.ptshell.testandroid.examples.designmode.builder_mode.ex1;

public abstract class Builder {
    //设置主机
    protected abstract void buildBoard(String board);

    //设置显示器
    protected abstract void buildDisplay(String display);

    //设置操作系统
    protected abstract void buildOS();

    //创建Computer
    public abstract Computer create();
}