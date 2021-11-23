package com.ptshell.testandroid.examples.designmode.factory_mode.ex2;

public abstract class Factory {
    //由子类实现具体生产什么 return具体产品对象
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
//public abstract class Factory{
//    //由子类实现具体生产什么 return具体产品对象
//    public abstract Product createProduct();
//}