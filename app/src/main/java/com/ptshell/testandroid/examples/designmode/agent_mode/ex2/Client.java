package com.ptshell.testandroid.examples.designmode.agent_mode.ex2;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        test();
        test2();
    }

    protected static void test() {
        ILawSuit xiaoMin = new XiaoMin();
        Lawyer lawyer = new Lawyer(xiaoMin);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

    protected static void test2() {
        //  构造一个小民
        ILawSuit xiaoMin = new XiaoMin();
        // 构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(xiaoMin);
        // 获取被代理类小民的ClassLoader
        ClassLoader loader = xiaoMin.getClass().getClassLoader();
        //动态构造一个代理者律师
        ILawSuit lawyer = (ILawSuit) Proxy.newProxyInstance(loader, new Class[]{ILawSuit.class}, dynamicProxy);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}