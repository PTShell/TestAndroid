package com.ptshell.testandroid.examples.designmode.builder_mode.ex2;

public class BMWX6Bulider extends Builder {
    private BMWCar mBMWCar = new BMWX6Car();

    @Override
    public Builder buliderShell(String shell) {
        mBMWCar.setShell(shell);
        return this;
    }

    @Override
    public Builder buliderControl(String control) {
        mBMWCar.setControl(control);
        return this;
    }

    @Override
    public Builder buliderEngineAndOthers() {
        mBMWCar.setEngineAndOthers();
        return this;
    }

    @Override
    public Builder buliderDecoration(String decoration) {
        mBMWCar.setDecoration(decoration);
        return this;
    }

    @Override
    public BMWCar create() {
        return mBMWCar;
    }
}