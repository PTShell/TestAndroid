package com.ptshell.testandroid.examples.designmode.memo_mode.ex1;

/**
 * 负责保存备忘录，不能对备忘录的内容进行操作和访问，只能将备忘录传递给其他对象。
 */
public class Caretaker {//备忘录管理类
    private Memento mMemento;

    public void setMemento(Memento memento) {
        mMemento = memento;
    }

    public Memento getMemento() {
        return mMemento;
    }
}