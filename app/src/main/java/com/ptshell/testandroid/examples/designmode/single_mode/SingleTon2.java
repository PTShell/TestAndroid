package com.ptshell.testandroid.examples.designmode.single_mode;

/**
 * 懒汉模式---用户第一次调用getInstance时进行初始化
 * getInstance()方法中添加了synchonized关键字，也就是变成了同步方法，在多线程下保证单例对象唯一性的手段。
 * 优点：单例只有在使用时才会被实例化。
 * 缺点：第一次加载时要及时进行实例化；每次调用getInstance()都进行同步，造成不必要的开销，这种模式一般不建议使用。
 */
public class SingleTon2 {
    private static SingleTon2 instance;

    private SingleTon2() {
    }

    public static synchronized SingleTon2 getInstance() {
        if (instance == null) {
            instance = new SingleTon2();
        }
        return instance;
    }
}
