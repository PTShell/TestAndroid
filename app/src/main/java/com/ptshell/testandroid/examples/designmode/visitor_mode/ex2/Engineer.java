package com.ptshell.testandroid.examples.designmode.visitor_mode.ex2;

import java.util.Random;

/**
 * 工程师类中添加了获取代码行数的函数，而经理类型中则添加了获取新产品数量的函数，
 * 它们的职责是不一样的，也正是它们的差异性，才使得访问者模式能够发挥它是作用。
 * Staff、Engineer、Manager3个类型就是对象结构，这些类型相对稳定，不会发生变化。
 */
public class Engineer extends Staff {
    public Engineer(String aName) {
        super(aName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //工程师这一年写的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
