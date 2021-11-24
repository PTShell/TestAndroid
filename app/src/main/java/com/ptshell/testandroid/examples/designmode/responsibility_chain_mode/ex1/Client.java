package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex1;

public class Client {
    public static void main(String[] args) {
        Processor1 processor1 = new Processor1();
        Processor2 processor2 = new Processor2();

        processor1.nextProcessor = processor2;
        processor2.nextProcessor = processor1;

        processor1.handleRequest("Processor2");
    }
}