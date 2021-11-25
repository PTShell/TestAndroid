package com.ptshell.testandroid.examples.designmode.adapter_mode.ex1;

public class Client {
    public void test() {
        Electric electric = new Electric();
        System.out.println("默认电压：" + electric.output_220v());

        Adapter phoneAdapter = new PhoneAdapter(electric);//传递一个对象给适配器
        System.out.println("适配转换后的电压：" + phoneAdapter.convert_5v());

    }
}
