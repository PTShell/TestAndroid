package com.ptshell.testandroid.examples.designmode.iterator_mode.ex3;

import java.util.ArrayList;
import java.util.List;

public class CompanyA implements Company {
    private List<Employee> list = new ArrayList<>();

    public CompanyA() {
        list.add(new Employee("小民", 96, "男", "程序员"));
        list.add(new Employee("小芸", 22, "女", "测试"));
        list.add(new Employee("小方", 18, "女", "测试"));
        list.add(new Employee("可儿", 21, "女", "设计"));
        list.add(new Employee("朗晴", 19, "女", "设计"));
    }

    public List<Employee> getEmployees() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new AIterator(list);
    }
}