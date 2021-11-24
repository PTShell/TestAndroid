package com.ptshell.testandroid.examples.designmode.command_mode.ex1;

//接收者类
public class Receiver {
    /**
     * 真正执行具体命令逻辑的方法
     */
    public void action() {
        System.out.println("执行具体操作");
    }
}