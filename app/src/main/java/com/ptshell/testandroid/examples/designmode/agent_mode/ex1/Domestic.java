package com.ptshell.testandroid.examples.designmode.agent_mode.ex1;

/**
 * 4.2 创建真实主题类
 * 国内的人想购买某些产品，定义具体的购买过程：
 */
public class Domestic implements People {

    @Override
    public void buy() {//具体实现
        System.out.println("国内要买一个包");
    }
}