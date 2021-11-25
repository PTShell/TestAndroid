package com.ptshell.testandroid.examples.designmode.agent_mode.ex2;

/**
 * 诉讼流程接口类：
 */
public interface ILawSuit {
    // 提交申请
    void submit();

    // 进行举证
    void burden();

    // 开始辩护
    void defend();

    // 诉讼完成
    void finish();
}