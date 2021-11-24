package com.ptshell.testandroid.examples.designmode.visitor_mode.ex2;

class ReportUtil {
    public void visit(Staff staff) {
        if (staff instanceof Manager) {
            Manager mgr = (Manager) staff;
            System.out.println("经理：" + mgr.name + ",KPI:" + mgr.kpi + ",新产品数量" + mgr.getProducts());
        } else {
            Engineer eng = (Engineer) staff;
            System.out.println("工程师：" + eng.name + ",KPI:" + eng.kpi);
        }
    }
}