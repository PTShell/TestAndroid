package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex3;

public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void vidoePlay(String data) {
        System.out.println("播放视频：" + data);
    }
}