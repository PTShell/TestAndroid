package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.factory;

import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.cpu.AmdCPU;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.cpu.CPU;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.hd.HD;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.hd.WdHD;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.memory.KingstonMemory;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.memory.Memory;

//具体工厂类--华硕电脑
public class AsusComputerFactory extends ComputerFactory {

    @Override
    public CPU createCPU() {
        return new AmdCPU();
    }

    @Override
    public Memory createMemory() {
        return new KingstonMemory();
    }

    @Override
    public HD createHD() {
        return new WdHD();
    }
}