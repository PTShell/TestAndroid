package com.ptshell.testandroid.examples.designmode.builder_mode.ex2;

public abstract class BMWCar {
    // 汽车外壳
    protected String mShell;
    // 汽车多媒体中控
    protected String mControl;
    // 汽车引擎和其他机械部件
    protected String mEngineAndOthers;
    // 汽车内饰
    protected String mDecoration;

    protected BMWCar() {

    }

    // 转配汽车外壳
    public void setShell(String mShell) {
        this.mShell = mShell;
    }

    // 装配汽车多媒体中控
    public void setControl(String mControl) {
        this.mControl = mControl;
    }

    // 装配汽车机械部件
    public void setEngineAndOthers() {
    }

    // 装配汽车内饰
    public void setDecoration(String mDecoration) {
        this.mDecoration = mDecoration;
    }
}