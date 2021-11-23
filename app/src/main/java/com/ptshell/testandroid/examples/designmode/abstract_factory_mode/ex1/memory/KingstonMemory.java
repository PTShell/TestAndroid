package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.memory;

//具体产品类-- 金士顿 内存
public class KingstonMemory extends Memory {

    @Override
    public void showMemory() {
        System.out.println("金士顿 内存");
    }
}