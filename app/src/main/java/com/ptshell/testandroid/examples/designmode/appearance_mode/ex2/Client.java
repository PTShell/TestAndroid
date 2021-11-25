package com.ptshell.testandroid.examples.designmode.appearance_mode.ex2;

/**
 * 客户端直接调动统一的接口：
 */
public class Client {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.videoChat();
        System.out.println("----");
        mobilePhone.hangup();
    }
}