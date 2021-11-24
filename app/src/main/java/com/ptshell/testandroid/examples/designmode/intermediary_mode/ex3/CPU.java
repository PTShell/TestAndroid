package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex3;

public class CPU extends Colleague {
    private String dataVideo, dataSound;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    //解析数据，分割音频和视频
    public void decodeData(String data) {
        String[] tmp = data.split("，");
        dataVideo = tmp[0];
        dataSound = tmp[1];
        mediator.change(this);
    }
}