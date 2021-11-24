package com.ptshell.testandroid.examples.designmode.command_mode.ex2;

//具体命令着 改变形状的命令类
public class TransformCommand implements Command {
    //持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        //调用游戏机里面的具体方法执行操作
        machine.transform();
    }
}