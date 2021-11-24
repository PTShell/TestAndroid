package com.ptshell.testandroid.examples.designmode.visitor_mode.ex2;

import java.util.LinkedList;
import java.util.List;

/**
 * 然后将这些员工添加到一个业务报表类中，
 * 公司高层通过该报表类的showReport函数查看所有员工的业绩
 */
public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<Staff>();

    public BusinessReport() {
        mStaffs.add(new Manager("manager-1"));
        mStaffs.add(new Engineer("engineer-1"));
        mStaffs.add(new Engineer("engineer-2"));
        mStaffs.add(new Engineer("engineer-3"));
        mStaffs.add(new Manager("manager-2"));
    }

    /**
     * 为访问者展示报表
     *
     * @param visitor CEO或者CTO
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }
}