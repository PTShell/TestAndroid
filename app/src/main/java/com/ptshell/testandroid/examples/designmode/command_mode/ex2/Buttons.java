package com.ptshell.testandroid.examples.designmode.command_mode.ex2;

//命令由按钮发起
public class Buttons {
    //向左移动的命令对象引用
    private LeftCommand leftCommand;
    //向右移动的命令对象引用
    private RightCommand rightCommand;
    //快速落下的命令对象引用
    private FallCommand fallCommand;
    //变换形状的命令对象引用
    private TransformCommand transformCommand;

    /**
     * 设置向左移动的命令对象
     *
     * @param leftCommand
     */
    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    /**
     * 设置向右移动的命令对象
     *
     * @param rightCommand
     */
    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    /**
     * 设置快速落下的命令对象
     *
     * @param fallCommand
     */
    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    /**
     * 设置变换形状的命令对象
     *
     * @param transformCommand
     */
    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    /**
     * 按下按钮向左移动
     */
    public void toLeft() {
        leftCommand.execute();
    }

    /**
     * 按下按钮向右移动
     */
    public void toRight() {
        rightCommand.execute();
    }

    /**
     * 按下按钮快速落下
     */
    public void fall() {
        fallCommand.execute();
    }

    /**
     * 按下按钮改变形状
     */
    public void transform() {
        transformCommand.execute();
    }
}