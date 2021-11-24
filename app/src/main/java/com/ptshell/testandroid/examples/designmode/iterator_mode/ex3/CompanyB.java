package com.ptshell.testandroid.examples.designmode.iterator_mode.ex3;

public class CompanyB implements Company {
    private Employee[] array = new Employee[3];

    public CompanyB() {
        array[0] = new Employee("辉哥", 108, "男", "程序员");
        array[1] = new Employee("小红", 98, "男", "程序员");
        array[2] = new Employee("小辉", 88, "男", "程序员");
    }

    public Employee[] getEmployees() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new BIterator(array);
    }
}