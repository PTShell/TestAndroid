package com.ptshell.testandroid.examples.designmode.combination_mode.ex1;

import java.util.Iterator;

/**
 * 创建树枝节点
 * 树枝节点能够删除添加叶子或树枝。
 */
public class Column extends PageElement {//栏目

    public Column(String name) {
        super(name);
    }

    @Override
    public void addPageElement(PageElement pageElement) {
        mPageElements.add(pageElement);
    }

    @Override
    public void rmPageElement(PageElement pageElement) {
        mPageElements.remove(pageElement);
    }

    @Override
    public void clear() {
        mPageElements.clear();
    }

    /**
     * @param placeholder 占位符
     */
    @Override
    public void print(String placeholder) {
        //利用递归来打印文件夹结构
        System.out.println(placeholder + "└──" + getName());
        Iterator<PageElement> i = mPageElements.iterator();
        while (i.hasNext()) {
            PageElement pageElement = i.next();
            pageElement.print(placeholder + "   ");
        }
    }

}