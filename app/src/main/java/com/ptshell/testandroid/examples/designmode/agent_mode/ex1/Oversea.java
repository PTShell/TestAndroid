package com.ptshell.testandroid.examples.designmode.agent_mode.ex1;

/**
 * 4.3 创建代理类
 * 海外的代购党需要知道是谁（持有真实主题类的引用）想购买啥产品：
 */
public class Oversea implements People {
    People mPeople;//持有People类的引用

    public Oversea(People people) {
        mPeople = people;
    }

    @Override
    public void buy() {
        System.out.println("我是海外代购：");
        mPeople.buy();//调用了被代理者的buy()方法,
    }
}