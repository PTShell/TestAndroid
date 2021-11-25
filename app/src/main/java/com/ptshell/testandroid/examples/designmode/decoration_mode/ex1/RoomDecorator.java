package com.ptshell.testandroid.examples.designmode.decoration_mode.ex1;

/**
 * 创建抽象装饰角色
 * 要为房子装修，定义抽象的房间装饰类：
 */
public abstract class RoomDecorator extends Room {//继承Room，拥有父类相同的方法
    private Room mRoom;//持有被装饰者的引用，这里是需要装修的房间

    public RoomDecorator(Room room) {
        this.mRoom = room;
    }

    @Override
    public void fitment() {
        mRoom.fitment();//调用被装饰者的方法
    }
}