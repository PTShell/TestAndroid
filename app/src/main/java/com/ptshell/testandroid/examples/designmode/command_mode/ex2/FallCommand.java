package com.ptshell.testandroid.examples.designmode.command_mode.ex2;

//具体命令着 快速落下的命令类
public class FallCommand implements Command {
    //持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        //调用游戏机里面的具体方法执行操作
        machine.fastToBottom();
    }
}
