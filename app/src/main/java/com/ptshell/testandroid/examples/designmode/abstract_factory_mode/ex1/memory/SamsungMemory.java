package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.memory;

//具体产品类-- 三星 内存
public class SamsungMemory extends Memory {

    @Override
    public void showMemory() {
        System.out.println("三星 内存");
    }
}