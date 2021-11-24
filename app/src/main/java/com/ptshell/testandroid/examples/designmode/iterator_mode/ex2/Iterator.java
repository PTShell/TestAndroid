package com.ptshell.testandroid.examples.designmode.iterator_mode.ex2;

/**
 * 迭代器接口：负责定义、访问和遍历元素的接口
 *
 * @param <T>
 */
public interface Iterator<T> {
    /**
     * 是否还有下一个对象
     *
     * @return true:有; false:没有
     */
    boolean hasNext();

    /**
     * @return 返回当前位置的元素并将位置移至下一位
     */
    T next();
}