package com.ptshell.testandroid.examples.designmode.template_mode.ex2;

//程序员的计算机
public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("程序要只需要进行用户名和密码验证就可以了");
    }
}