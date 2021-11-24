package com.ptshell.testandroid.examples.designmode.visitor_mode.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 另外，为了方便访问多个元素，创建一个对象结构,
 * 在其内部管理元素集合,并且可以迭代这些元素供访问者访问：
 */
public class Websites {
    List<Web> list = new ArrayList<>();//元素集合

    public void accept(Visitor visitor) {
        Iterator<Web> iterator = list.iterator();
        while (iterator.hasNext()) {//迭代遍历访问
            iterator.next().accept(visitor);
        }
    }

    public void addWeb(Web web) {
        list.add(web);
    }
}