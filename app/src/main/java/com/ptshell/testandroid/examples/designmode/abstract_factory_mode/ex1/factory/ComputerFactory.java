package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.factory;

import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.cpu.CPU;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.hd.HD;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.memory.Memory;

//抽象工厂类，电脑工厂类
public abstract class ComputerFactory {
    public abstract CPU createCPU();

    public abstract Memory createMemory();

    public abstract HD createHD();
}