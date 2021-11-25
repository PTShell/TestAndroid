package com.ptshell.testandroid.examples.designmode.template_mode.ex2;

/**
 * 模板方法实际上是封装了一个固定流程，就像是一套执行模板一样，
 * 第一步该做什么，第二步该做什么都已经在抽象类中定义好了。
 * 而子类可以有不同的算法实现，在框架不被修改的情况下实现某些步骤的算法替换，下
 * 面以打开计算机这个动作来简单演示一下模板方法。
 * 打开计算机的整个过程都是相对固定的，
 * 首先启动计算机电源，计算机检测自身状态没有问题时将进入操作系统，
 * 对用户进行验证之后即可登录计算机，下面我们使用模板方法来模拟一下这个过程：
 */
//抽象的Computer
public abstract class AbstractComputer {

    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardware() {
        System.out.println("硬件检查");
    }

    protected void loaOs() {
        System.out.println("载入操作系统");
    }

    protected void login() {
        System.out.println("小白的计算机无验证，直接进入系统");
    }

    /**
     * 启动计算机方法，步骤固定为：
     * 1,开启电源
     * 2,系统检查
     * 3,加载操作系统
     * 4,用户登录。
     * 该方法为final,防止算法框架被覆写
     */
    public final void startUp() {
        System.out.println("--开机 START--");
        powerOn();
        checkHardware();
        loaOs();
        login();
        System.out.println("--开机 EDN--");
    }
}