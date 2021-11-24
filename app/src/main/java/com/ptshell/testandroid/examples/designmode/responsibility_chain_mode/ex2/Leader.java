package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex2;

import android.util.Log;

public abstract class Leader {
    protected Leader nextHandler;//上一级领导（处理者）,UML图中的successor

    /**
     * 处理报账请求
     *
     * @param money 报账额度
     *              申明为final，子类无法重写
     */
    public final void handleRequest(double money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != nextHandler) {//有上一级处理者
                nextHandler.handleRequest(money);
            } else {
                Log.e(getClass().getSimpleName(), "没有领导能批复你的票据报销啦，自己去报销吧！");
            }
        }
    }

    /**
     * 自身能批复的报账额度
     *
     * @return 额度
     */
    public abstract double limit();

    /**
     * 处理报账行为
     *
     * @param money 报账额度
     */
    public abstract void handle(double money);
}