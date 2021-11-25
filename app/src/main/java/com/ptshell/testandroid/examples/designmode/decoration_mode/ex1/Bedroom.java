package com.ptshell.testandroid.examples.designmode.decoration_mode.ex1;

/**
 * 我们要将房间装修成卧室和厨房，其具体实现是不同的：
 */
public class Bedroom extends RoomDecorator {//卧室类，继承自RoomDecorator

    public Bedroom(Room room) {
        super(room);
    }

    @Override
    public void fitment() {
        super.fitment();
        addBedding();
    }

    private void addBedding() {
        System.out.println("装修成卧室：添加卧具");
    }
}