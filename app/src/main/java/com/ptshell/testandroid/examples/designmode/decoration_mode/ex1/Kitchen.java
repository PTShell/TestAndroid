package com.ptshell.testandroid.examples.designmode.decoration_mode.ex1;

public class Kitchen extends RoomDecorator {//厨房类，继承自RoomDecorator

    public Kitchen(Room room) {
        super(room);
    }

    @Override
    public void fitment() {
        super.fitment();
        addKitchenware();
    }

    private void addKitchenware() {
        System.out.println("装修成厨房：添加厨具");
    }
}