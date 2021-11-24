package com.ptshell.testandroid.examples.designmode.intermediary_mode.ex3;

public abstract class Colleague {
    public Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}