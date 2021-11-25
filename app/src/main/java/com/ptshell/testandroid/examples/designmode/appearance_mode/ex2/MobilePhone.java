package com.ptshell.testandroid.examples.designmode.appearance_mode.ex2;

/**
 * 然后封装一个门面：
 */
public class MobilePhone {
    private Phone phone = new PhoneImpl();
    private Camera camera = new CameraImpl();

    public void videoChat() {
        camera.open();
        phone.dail();
    }

    public void hangup() {
        phone.hangup();
        camera.close();
    }
}