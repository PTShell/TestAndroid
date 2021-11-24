package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex2;

import android.util.Log;

//组长
public class GroupLeader extends Leader {
    @Override
    public double limit() {
        return 1000;
    }

    @Override
    public void handle(double money) {
        Log.e(getClass().getSimpleName(), "组长批复报销了你的" + money + "元");
    }
}