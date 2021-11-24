package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex3;

public class CDDevice extends Colleague {
    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read() {
        return data;
    }

    public void load() {
        data = "视频数据，音频数据";
        mediator.change(this);
    }
}