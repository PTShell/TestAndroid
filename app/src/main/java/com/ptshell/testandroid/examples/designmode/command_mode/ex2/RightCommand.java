package com.ptshell.testandroid.examples.designmode.command_mode.ex2;

//具体命令着 向右移动的命令类
public class RightCommand implements Command {
    //持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        //调用游戏机里面的具体方法执行操作
        machine.toRight();
    }
}
