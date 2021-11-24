package com.ptshell.testandroid.examples.designmode.iterator_mode.ex2;

/**
 * 容器接口：负责提供创建具体迭代器角色的接口
 *
 * @param <T>
 */
public interface Aggregate<T> {
    /**
     * 添加一个元素
     *
     * @param obj 元素对象
     */
    void add(T obj);

    /**
     * 移除一个元素
     *
     * @param obj 元素对象
     */
    void remove(T obj);

    /**
     * 获取容器的迭代器
     *
     * @return 迭代器对象
     */
    Iterator<T> iterator();
}