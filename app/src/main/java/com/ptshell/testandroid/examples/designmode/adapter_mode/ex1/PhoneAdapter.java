package com.ptshell.testandroid.examples.designmode.adapter_mode.ex1;

/**
 * 我们需要一个具体适配器，这个适配器就是变压器，能够将220V转为5V输出：
 */
public class PhoneAdapter implements Adapter {//手机适配器类
    private Electric mElectric;//适配器持有源目标对象

    public PhoneAdapter(Electric electric) {//通过构造方法传入对象
        mElectric = electric;
    }

    @Override
    public int convert_5v() {
        System.out.println("适配器开始工作：");
        System.out.println("输入电压：" + mElectric.output_220v());
        System.out.println("输出电压：" + 5);
        return 5;
    }
}