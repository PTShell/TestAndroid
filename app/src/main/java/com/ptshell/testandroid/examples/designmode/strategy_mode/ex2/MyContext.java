package com.ptshell.testandroid.examples.designmode.strategy_mode.ex2;

public class MyContext {

    private ChaseStragety chaseStragety;//定义抽象策略类

    public MyContext(ChaseStragety chaseStragety) {//构造方法传递具体策略对象过来
        this.chaseStragety = chaseStragety;
    }

    public void chase() {//执行具体策略对象的策略
        chaseStragety.chase();
    }
}