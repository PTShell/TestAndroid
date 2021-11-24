package com.ptshell.testandroid.examples.designmode.template_mode.ex1;

public class Client {
    public void test() {
        System.out.println("----派送A----");
        Postman postA = new PostA();
        postA.post();
        System.out.println("----派送B----");
        Postman postB = new PostB();
        postB.post();
    }
}
