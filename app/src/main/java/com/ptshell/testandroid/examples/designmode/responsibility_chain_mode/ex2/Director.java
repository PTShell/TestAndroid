package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex2;

import android.util.Log;

//主管
public class Director extends Leader {
    @Override
    public double limit() {
        return 10000;
    }

    @Override
    public void handle(double money) {
        Log.e(getClass().getSimpleName(), "主管批复报销了你的" + money + "元");
    }
}