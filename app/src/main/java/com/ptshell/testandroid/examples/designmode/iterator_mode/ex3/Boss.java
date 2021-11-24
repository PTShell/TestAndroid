package com.ptshell.testandroid.examples.designmode.iterator_mode.ex3;

public class Boss {
    public static void main(String[] args) {
        CompanyA a = new CompanyA();
        check(a.iterator());
        CompanyB b = new CompanyB();
        check(b.iterator());
    }

    private static void check(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}