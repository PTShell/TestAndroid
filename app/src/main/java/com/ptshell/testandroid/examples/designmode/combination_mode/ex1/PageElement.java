package com.ptshell.testandroid.examples.designmode.combination_mode.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建抽象组件角色
 * 这里就是一个网站的抽象页面元素：
 */
public abstract class PageElement {//页面
    protected List<PageElement> mPageElements = new ArrayList<>();//用来保存页面元素
    private String name;

    public PageElement(String name) {
        this.name = name;
    }

    public abstract void addPageElement(PageElement pageElement);//添加栏目或者具体内容

    public abstract void rmPageElement(PageElement pageElement);//删除栏目或者具体内容

    public abstract void clear();//清空所有元素

    public abstract void print(String placeholder);//打印页面结构

    public String getName() {
        return name;
    }
}