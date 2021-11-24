package com.ptshell.testandroid.examples.designmode.responsibility_chain_mode.ex2;

public class XiaoMin {
    public void main(String[] args) {
        init();
    }

    protected void init() {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        //设置上一级领导（处理者）对象
        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        //发起报账申请
        groupLeader.handleRequest(100000);
    }
}