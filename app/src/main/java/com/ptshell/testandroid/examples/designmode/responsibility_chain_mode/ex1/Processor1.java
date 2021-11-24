package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex1;

public class Processor1 extends Handler {
    @Override
    public void handleRequest(String msg) {
        if (msg.equals("Processor1")) {
            System.out.println("第一个处理者处理");
        } else {
            nextProcessor.handleRequest(msg);
        }
    }
}