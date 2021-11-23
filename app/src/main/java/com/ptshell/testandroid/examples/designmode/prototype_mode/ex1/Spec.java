package com.ptshell.testandroid.examples.designmode.prototype_mode.ex1;

//规格类，有长和宽这两个属性
public class Spec {
    private int width;
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Spec{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}