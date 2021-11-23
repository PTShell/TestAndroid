package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.factory;

import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.cpu.CPU;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.cpu.IntelCPU;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.hd.HD;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.hd.SeagateHD;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.memory.Memory;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.memory.SamsungMemory;

//具体工厂类--联想电脑
public class LenovoComputerFactory extends ComputerFactory {

    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public Memory createMemory() {
        return new SamsungMemory();
    }

    @Override
    public HD createHD() {
        return new SeagateHD();
    }
}
    