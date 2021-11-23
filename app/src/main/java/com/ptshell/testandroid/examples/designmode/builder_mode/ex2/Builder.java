package com.ptshell.testandroid.examples.designmode.builder_mode.ex2;

public abstract class Builder {
    // 设置外壳
    public abstract Builder buliderShell(String shell);

    // 设置中控系统
    public abstract Builder buliderControl(String control);

    // 装置机械组件
    public abstract Builder buliderEngineAndOthers();

    // 装配内饰
    public abstract Builder buliderDecoration(String decoration);

    // 出厂汽车
    public abstract BMWCar create();
}