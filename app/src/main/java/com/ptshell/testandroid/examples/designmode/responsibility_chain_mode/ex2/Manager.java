package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex2;

import android.util.Log;

//经理
public class Manager extends Leader {
    @Override
    public double limit() {
        return 50000;
    }

    @Override
    public void handle(double money) {
        Log.e(getClass().getSimpleName(), "经理批复报销了你的" + money + "元");
    }
}