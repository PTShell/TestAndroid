package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex3;

public class Client {
    public void test() {
        //创建不同的快递员对象
        Postman beijingPostman = new BeijingPostman();
        Postman shanghaiPostman = new ShanghaiPostman();
        Postman guangzhouPostman = new GuangzhouPostman();

        //创建下一个结点
        beijingPostman.nextPostman = shanghaiPostman;
        shanghaiPostman.nextPostman = guangzhouPostman;

        //处理不同地区的快递，都是从首结点北京快递员开始
        System.out.println("有一个上海快递需要派送:");
        beijingPostman.handleCourier("Shanghai");
        System.out.println("有一个广州快递需要派送:");
        beijingPostman.handleCourier("Guangzhou");
        System.out.println("有一个美国快递需要派送:");
        beijingPostman.handleCourier("America");

    }
}
