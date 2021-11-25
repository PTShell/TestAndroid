package com.ptshell.testandroid.examples.designmode.agent_mode.ex2;

/**
 * 小民并不会打官司，于是请代理律师
 */
public class Lawyer implements ILawSuit {
    // 持有一个具体被代理者的引用
    private ILawSuit mLawSuit;

    public Lawyer(ILawSuit iLawSuit) {
        this.mLawSuit = iLawSuit;
    }

    @Override
    public void submit() {
        mLawSuit.submit();
    }

    @Override
    public void burden() {
        mLawSuit.burden();
    }

    @Override
    public void defend() {
        mLawSuit.defend();
    }

    @Override
    public void finish() {
        mLawSuit.finish();
    }
}