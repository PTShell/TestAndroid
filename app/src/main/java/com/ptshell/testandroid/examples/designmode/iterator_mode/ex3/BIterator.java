package com.ptshell.testandroid.examples.designmode.iterator_mode.ex3;

public class BIterator implements Iterator {
    private Employee[] array;
    private int position;

    public BIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length - 1 || array[position] == null);
    }

    @Override
    public Object next() {
        Employee e = array[position];
        position++;
        return e;
    }
}