package com.ptshell.testandroid.examples.designmode.decoration_mode.ex1;

public class Client {
    public void test() {
        Room newRoom = new NewRoom();//有一间新房间
        RoomDecorator bedroom = new Bedroom(newRoom);
        bedroom.fitment();//装修成卧室
        RoomDecorator kitchen = new Kitchen(newRoom);
        kitchen.fitment();//装修成厨房
    }
}
