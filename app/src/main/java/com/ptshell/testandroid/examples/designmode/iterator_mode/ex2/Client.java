package com.ptshell.testandroid.examples.designmode.iterator_mode.ex2;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Aggregate<String> a = new ConcreteAggregate<>();
        a.add("hello1");
        a.add("hello2");
        a.add("hello3");
        a.add("hello4");
        a.add("hello5");

        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}