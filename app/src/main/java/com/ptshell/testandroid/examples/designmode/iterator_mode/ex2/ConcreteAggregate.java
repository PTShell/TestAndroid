package com.ptshell.testandroid.examples.designmode.iterator_mode.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器类：具体迭代器角色与该容器相关联
 *
 * @param <T>
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}