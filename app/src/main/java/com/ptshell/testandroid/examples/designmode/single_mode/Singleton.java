package com.ptshell.testandroid.examples.designmode.single_mode;

/**
 * 饿汉模式---声明对象时就已经初始化
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    //构造函数私有
    private Singleton() {
    }

    //公有静态函数，对外暴露获取单例对象的接口
    public static Singleton getInstance() {
        return instance;
    }
}