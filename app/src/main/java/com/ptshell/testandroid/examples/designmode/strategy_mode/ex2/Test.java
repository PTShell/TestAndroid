package com.ptshell.testandroid.examples.designmode.strategy_mode.ex2;

public class Test {
    public void test() {

        MyContext context;

        System.out.println("遇到爱逛街的妹子:");
        context = new MyContext(new ShoppingStrategy());
        context.chase();

        System.out.println("遇到爱看电影的妹子:");
        context = new MyContext(new MoviesStrategy());
        context.chase();

        System.out.println("遇到吃货妹子:");
        context = new MyContext(new EattingStrategy());
        context.chase();

    }
}
