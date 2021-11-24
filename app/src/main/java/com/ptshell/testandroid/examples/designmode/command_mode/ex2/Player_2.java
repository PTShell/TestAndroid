package com.ptshell.testandroid.examples.designmode.command_mode.ex2;

//客户类
public class Player_2 {
    public static void main(String[] args) {
        //首先要有俄罗斯方块游戏
        TetrisMachine machine = new TetrisMachine();

        machine.toLeft();
        machine.toRight();
        machine.fastToBottom();
        machine.transform();
    }
}