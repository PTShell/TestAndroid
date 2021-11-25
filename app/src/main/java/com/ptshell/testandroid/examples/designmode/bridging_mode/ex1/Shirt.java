package com.ptshell.testandroid.examples.designmode.bridging_mode.ex1;

/**
 * 创建两种衣服类：校服和衬衫。
 */
public class Shirt implements Clothes {

    @Override
    public String getName() {
        return "衬衫";
    }
}