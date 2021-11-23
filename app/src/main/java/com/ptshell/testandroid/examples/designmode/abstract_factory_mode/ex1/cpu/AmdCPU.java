package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.cpu;

//具体产品类-- AMD CPU
public class AmdCPU extends CPU {

    @Override
    public void showCPU() {
        System.out.println("AMD CPU");
    }
}