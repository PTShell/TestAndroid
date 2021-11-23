package com.ptshell.testandroid.examples.designmode.builder_mode.ex2;

public class Director {
    Builder mBulider = null;

    public Director(Builder builder){
        this.mBulider = builder;
    }

    /**
     * 统一组装，简化生产步骤
     * @param shell
     * @param control
     * @param decoration
     * @return
     */
    public BMWCar createCar(String shell,String control,String decoration){
        return mBulider.buliderShell(shell)
                .buliderControl(control)
                .buliderEngineAndOthers()
                .buliderDecoration(decoration).create();
    }
}