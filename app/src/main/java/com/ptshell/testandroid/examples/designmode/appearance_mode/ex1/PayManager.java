package com.ptshell.testandroid.examples.designmode.appearance_mode.ex1;

//支付系统
public class PayManager {
    public void pay(int momey) {
        System.out.println("生成订单信息");
        System.out.println("选择支付方式");
        System.out.println("支付成功：" + momey + "元");
    }
}