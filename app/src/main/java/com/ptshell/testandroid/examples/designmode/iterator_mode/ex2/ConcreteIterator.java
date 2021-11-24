package com.ptshell.testandroid.examples.designmode.iterator_mode.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体迭代器类：实现迭代器接口，并记录遍历的当前位置
 *
 * @param <T>
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list = new ArrayList<T>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}