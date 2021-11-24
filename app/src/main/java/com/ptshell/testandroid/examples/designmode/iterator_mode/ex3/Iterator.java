package com.ptshell.testandroid.examples.designmode.iterator_mode.ex3;

public interface Iterator {
    // 是否还有下一个
    boolean hasNext();

    //返回当前元素，并将位置移动到下一位
    Object next();
}