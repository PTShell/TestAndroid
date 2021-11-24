package com.ptshell.testandroid.examples.designmode.state_mode.ex1;

public class Test {
    public static void test() {
        TvController controller = new TvController();
        controller.powerOn();
        controller.nextChannel();
        controller.turnUp();
        controller.powerOff();
        controller.turnUp();
    }
}