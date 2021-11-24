package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex2;

import android.util.Log;

//BOSS
public class Boss extends Leader {
    @Override
    public double limit() {
        return 999999;
    }

    @Override
    public void handle(double money) {
        Log.e(getClass().getSimpleName(), "老板批复报销了你的" + money + "元");
    }
}