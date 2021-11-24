package com.ptshell.testandroid.examples.designmode.template_mode.ex2;

//测试代码
public class Test {
    public static void main(String[] args) {
        AbstractComputer computer = new CoderComputer();
        computer.startUp();

        computer = new MilitaryComputer();
        computer.startUp();
    }
}