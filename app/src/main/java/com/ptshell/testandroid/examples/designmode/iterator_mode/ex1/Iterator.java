package com.ptshell.testandroid.examples.designmode.iterator_mode.ex1;

/**
 * 创建迭代器接口
 */
public interface Iterator {

    boolean hasNext();    //是否存在下一条记录

    Object next();        //返回当前记录并移到下一条记录
}