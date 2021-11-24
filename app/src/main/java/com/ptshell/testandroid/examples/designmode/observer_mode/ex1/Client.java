package com.ptshell.testandroid.examples.designmode.observer_mode.ex1;

public class Client {
    public void test() {
        Observable postman = new Postman();

        Observer boy1 = new Boy("路飞");
        Observer boy2 = new Boy("乔巴");
        Observer girl1 = new Girl("娜美");

        postman.add(boy1);
        postman.add(boy2);
        postman.add(girl1);

        postman.notify("快递到了,请下楼领取.");
    }
}
