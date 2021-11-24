package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex3;

/**
 * 最后通过一个客户端模拟播放电影
 */
public class Client {
    public static void main(String[] args) {
        //  构造主板
        MainBoard mediator = new MainBoard();

        //构造各个零件
        CDDevice cd = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard vc = new GraphicsCard(mediator);
        SoundCard sc = new SoundCard(mediator);

        //零件安装到主板
        mediator.setCdDevice(cd);
        mediator.setCpu(cpu);
        mediator.setGraphicsCard(vc);
        mediator.setSoundCard(sc);

        //播放
        cd.load();
    }
}