package com.ptshell.testandroid.examples.designmode.combination_mode.ex1;

/**
 * 创建叶子节点
 * 叶子节点继承了抽象组件角色，但是由于没有分支，所以一些添加删除操作是实现不了的。
 * 叶子节点都是一些具体的内容，比如具体的音乐内容、视屏内容等等。
 */
public class Content extends PageElement {//具体内容

    public Content(String name) {
        super(name);
    }

    @Override
    public void addPageElement(PageElement pageElement) {
        throw new UnsupportedOperationException("不支持此操作");
    }

    @Override
    public void rmPageElement(PageElement pageElement) {
        throw new UnsupportedOperationException("不支持此操作");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("不支持此操作");
    }

    @Override
    public void print(String placeholder) {
        System.out.println(placeholder + "──" + getName());
    }

}