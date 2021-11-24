package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex3;

public class MainBoard extends Mediator {
    private CDDevice cdDevice;//光驱
    private CPU cpu;
    private GraphicsCard graphicsCard;//显卡
    private SoundCard soundCard;//声卡

    @Override
    public void change(Colleague colleague) {
        if (colleague == cdDevice) {//如果是光驱读取了数据
            handleCD((CDDevice) colleague);
        }
        if (colleague == cpu) {//如果是CPU处理完数据
            handleCPU((CPU) colleague);
        }
    }

    private void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.read());
    }

    private void handleCPU(CPU cpu) {
        soundCard.playSound(cpu.getDataSound());
        graphicsCard.vidoePlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}