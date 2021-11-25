package com.ptshell.testandroid.examples.designmode.adapter_mode.ex1;

/**
 * 创建适配器接口
 * 现在我们需要定义一个220V转换成5V的接口：
 */
interface Adapter {//适配器类

    int convert_5v();//装换成5V
}