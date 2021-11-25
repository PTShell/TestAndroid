package com.ptshell.testandroid.examples.designmode.enjoy_yuan_mode.ex1;

/**
 * 创建共享单车类，其中单价是它的内部状态，不随环境而改变;
 * 总价是它的外部状态，随着环境改变而改变。
 */
public class ShareBike implements IBike {//共享单车类
    private int price = 1;//单价
    private int total;//总价

    @Override
    public void billing(int time) {
        total = price * time;
        System.out.println("骑车花费了" + total + "元");
    }
}