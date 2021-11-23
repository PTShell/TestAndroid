package com.ptshell.testandroid.examples.designmode.strategy_mode.ex2;

public class MoviesStrategy implements ChaseStragety {

    @Override
    public void chase() {
        System.out.println("一起看电影咯~");
    }
}