package com.ptshell.testandroid.examples.designmode.single_mode;

/**
 * 静态内部类实现单例模式
 *
 * 使用静态内部类能保证线程安全的原因：
 * 1由于内部静态类只会被加载一次，故该实现方式是线程安全的
 * 2类加载的初始化阶段是单线程的
 *
 * 当第一次加载Singleton类时不会初始化instance，只有调用时才会初始化。
 * 因为第一次调用getInstance方法会导致虚拟机加载SingletonHolder类，
 * 这种方式不仅能确保线程安全，也能保证唯一性，同时也延迟了单例的实例化，
 * 所以这是推荐的单例模式实现方式。
 *
 */
public class SingleTon4 {
    private SingleTon4() {
    }

    public static SingleTon4 getInstance() {
        return SingleTon4Holder.sInstance;
    }

    //静态内部类
    private static class SingleTon4Holder {
        private static final SingleTon4 sInstance = new SingleTon4();
    }
}