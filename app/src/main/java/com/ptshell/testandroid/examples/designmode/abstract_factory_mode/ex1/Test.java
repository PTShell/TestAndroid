package com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1;

import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.factory.AsusComputerFactory;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.factory.ComputerFactory;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.factory.HpComputerFactory;
import com.ptshell.testandroid.examples.designmode.abstract_factory_mode.ex1.factory.LenovoComputerFactory;

public class Test {
    public void test() {
        System.out.println("--------------------生产联想电脑-----------------------");
        ComputerFactory lenovoComputerFactory = new LenovoComputerFactory();
        lenovoComputerFactory.createCPU().showCPU();
        lenovoComputerFactory.createMemory().showMemory();
        lenovoComputerFactory.createHD().showHD();

        System.out.println("--------------------生产华硕电脑-----------------------");
        ComputerFactory asusComputerFactory = new AsusComputerFactory();
        asusComputerFactory.createCPU().showCPU();
        asusComputerFactory.createMemory().showMemory();
        asusComputerFactory.createHD().showHD();

        System.out.println("--------------------生产惠普电脑-----------------------");
        ComputerFactory hpComputerFactory = new HpComputerFactory();
        hpComputerFactory.createCPU().showCPU();
        hpComputerFactory.createMemory().showMemory();
        hpComputerFactory.createHD().showHD();
    }
}
