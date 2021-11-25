package com.ptshell.testandroid.examples.designmode.appearance_mode.ex1;

/**
 * 这里只要是封装游戏SDK对外的接口，供游戏去研发去调用。这里只有两个接口：登录和充值。
 */
public class GameSdk {
    public void login() {//登录接口
        //调用登录子系统的接口
        LoginManager loginManager = new LoginManager();
        loginManager.login();
    }

    public void pay(int momey) {//支付接口
        //调用支付子系统的接口
        PayManager payManager = new PayManager();
        payManager.pay(momey);
    }
}