package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex1;

public class Processor2 extends Handler {
    @Override
    public void handleRequest(String msg) {
        if (msg.equals("Processor2")) {
            System.out.println("第二个处理者处理");
        } else {
            nextProcessor.handleRequest(msg);
        }
    }
}