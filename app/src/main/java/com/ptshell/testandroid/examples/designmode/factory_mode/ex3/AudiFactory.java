package com.ptshell.testandroid.examples.designmode.factory_mode.ex3;

public abstract class AudiFactory {
    /**
     * 某车型的工厂方法
     *
     * @param clz 具体的SUV型号
     * @return 具体型号的SUV车对象
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}