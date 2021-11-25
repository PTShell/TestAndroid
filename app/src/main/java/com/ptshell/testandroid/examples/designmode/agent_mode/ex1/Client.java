package com.ptshell.testandroid.examples.designmode.agent_mode.ex1;

import java.lang.reflect.Proxy;

public class Client {
    public void test() {
        People domestic = new Domestic();        //创建国内购买人
        People oversea = new Oversea(domestic);  //创建海外代购类并将domestic作为构造函数传递
        oversea.buy();                           //调用海外代购的buy()
    }

    public void test2() {
        People domestic = new Domestic();                                 //创建国内购买人
        DynamicProxy proxy = new DynamicProxy(domestic);                  //创建动态代理
        ClassLoader classLoader = domestic.getClass().getClassLoader();   //获取ClassLoader
        People oversea = (People) Proxy.newProxyInstance(classLoader, new Class[]{People.class}, proxy); //通过 Proxy 创建海外代购实例 ，实际上通过反射来实现的。
        oversea.buy();//调用海外代购的buy()
    }
}
