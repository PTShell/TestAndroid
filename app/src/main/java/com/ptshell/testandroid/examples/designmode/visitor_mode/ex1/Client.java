package com.ptshell.testandroid.examples.designmode.visitor_mode.ex1;

public class Client {
    public void test() {
        //创建不同的元素
        Music wangyiyue = new Music("网易云音乐");
        Music kugou = new Music("酷狗");
        Video youku = new Video("优酷");
        Video iqiyi = new Video("爱奇艺");

        //放入对象结构中
        Websites websites = new Websites();
        websites.addWeb(wangyiyue);
        websites.addWeb(kugou);
        websites.addWeb(youku);
        websites.addWeb(iqiyi);

        Visitor idler1 = new Idler("闲人1号");
        websites.accept(idler1);//集合接受idler1的访问

        System.out.println("-------------------------------------");
        Visitor busy1 = new Busy("忙人2号");
        websites.accept(busy1);////集合接受busy1的访问
    }
}
