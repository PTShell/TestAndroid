package com.ptshell.testandroid.examples.designmode.single_mode;

/**
 * Double Check Lock（DCL）实现单例
 * 第一次判空是为了避免不必要的同步，第二次判空是为了在null情况下创建实例。分析：
 * instance = new Singleton(); 一句代码分为三步操作：
 * 1给Singleton实例分配内存；
 * 2调用Singleton（）构造函数，初始化成员字段；
 * 3将instance对象指向分配的内存空间（此时instance就不是null了）。
 *
 * DCL优点：资源利用率高，第一次执行getInstance才会被实例化，效率高。
 * 缺点：第一次加载时反映稍慢，也由于内存模型的原因偶尔会失败。在高并发的环境下也有一定的缺陷，虽然发生率很小。
 * DCL是使用最多的单例实现方式，它能够在需要时才实例化，并且能够在大多数时保证对象唯一性。
 * 注：不低于JDK1.6版本以下
 */
public class SingleTon3 {
    private volatile static SingleTon3 instance = null;

    private SingleTon3() {
    }

    public static synchronized SingleTon3 getInstance() {
        if (instance == null) {
            synchronized (SingleTon3.class) {
                if (instance == null) {
                    instance = new SingleTon3();
                }
            }
        }
        return instance;
    }
}