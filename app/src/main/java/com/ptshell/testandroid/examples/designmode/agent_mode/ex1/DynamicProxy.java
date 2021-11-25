package com.ptshell.testandroid.examples.designmode.agent_mode.ex1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 从代码的角度来分，代理可以分为两种：一种是静态代理，另一种是动态代理。
 * <p>
 *   静态代理就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。
 * 上面的例子实现就是静态代理。
 * <p>
 *   动态代理类的源码是在程序运行期间根据反射等机制动态的生成，所以不存在代理类的字节码文件。
 * 代理类和委托类的关系是在程序运行时确定。
 * <p>
 *   下面我们实现动态代理，Java提供了动态的代理接口InvocationHandler，实现该接口需要重写invoke()方法：
 */
public class DynamicProxy implements InvocationHandler {//实现InvocationHandler接口
    private Object obj;//被代理的对象

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    //重写invoke()方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("海外动态代理调用方法： " + method.getName());
        Object result = method.invoke(obj, args);//调用被代理的对象的方法
        return result;
    }
}