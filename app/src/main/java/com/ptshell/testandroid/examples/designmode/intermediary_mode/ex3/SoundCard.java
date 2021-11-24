package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex3;

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void playSound(String data) {
        System.out.println("播放音频：" + data);
    }
}