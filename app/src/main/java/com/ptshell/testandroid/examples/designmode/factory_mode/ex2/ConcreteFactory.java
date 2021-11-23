package com.ptshell.testandroid.examples.designmode.factory_mode.ex2;

public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}