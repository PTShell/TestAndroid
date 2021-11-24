package com.ptshell.testandroid.examples.designmode.iterator_mode.ex3;

import java.util.List;

public class AIterator implements Iterator {
    private List<Employee> list;
    private int position;

    public AIterator(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee e = list.get(position);
        position++;
        return e;
    }
}