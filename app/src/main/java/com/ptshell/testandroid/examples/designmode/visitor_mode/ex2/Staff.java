package com.ptshell.testandroid.examples.designmode.visitor_mode.ex2;

import java.util.Random;

/* 员工基类
 * Staff类定义了员工的基本信息以及一个accept方法，accept方法表示接受访问者的访问，由子类具体实现。
 */
public abstract class Staff {
    public String name;
    public int kpi; //员工kpi

    public Staff(String aName) {
        this.name = aName;
        kpi = new Random().nextInt(10);
    }

    //接受Visitor的访问
    public abstract void accept(Visitor visitor);
}