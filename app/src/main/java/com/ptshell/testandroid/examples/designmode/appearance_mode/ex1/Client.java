package com.ptshell.testandroid.examples.designmode.appearance_mode.ex1;

public class Client {
    private void test() {
        //这里是游戏研发，通过调用login()和pay()就能调起登录和支付，
        // 无需关心支付是使用支付宝还是威信等，这是游戏SDK里面去做的事。
        GameSdk gameSdk = new GameSdk();
        gameSdk.login();
        gameSdk.pay(6);
    }
}
