package com.ptshell.testandroid.examples.designmode.decoration_mode.ex1;

/**
 * 创建具体组件
 * 现在有一间新房子，已经装上了电：
 */
public class NewRoom extends Room {//继承Room

    @Override
    public void fitment() {
        System.out.println("这是一间新房：装上电");
    }
}