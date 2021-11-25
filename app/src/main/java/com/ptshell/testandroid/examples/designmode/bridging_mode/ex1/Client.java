package com.ptshell.testandroid.examples.designmode.bridging_mode.ex1;

public class Client {
    public void test() {
        //创建各种衣服对象
        Clothes uniform = new Uniform();
        Clothes shirt = new Shirt();

        //不同职业的人穿衣服
        Person coder = new Coder();
        coder.setClothes(shirt);
        coder.dress();

        System.out.println("--------------------------------------");
        Person student = new Student();
        student.setClothes(uniform);
        student.dress();

        System.out.println("--------------------------------------");
        student.setClothes(shirt);
        student.dress();
    }
}
