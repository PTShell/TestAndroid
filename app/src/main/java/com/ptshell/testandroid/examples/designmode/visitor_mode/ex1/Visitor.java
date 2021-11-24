package com.ptshell.testandroid.examples.designmode.visitor_mode.ex1;

/**
 * 为每一个元素声明一个访问的方法：
 */
public interface Visitor {
    void visit(Music music);//访问音乐类

    void visit(Video video);//访问视频类
}