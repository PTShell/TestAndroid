package com.ptshell.testandroid.examples.designmode.visitor_mode.ex2;

import android.util.Log;

public class CEOVisitor implements Visitor {

    private static final String TAG = "CEOVisitor";

    @Override
    public void visit(Engineer engineer) {
        Log.v(TAG, "engineer：" + engineer.name + ", KPI：" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        Log.v(TAG, "mananger:" + manager.name + ", KPI：" + manager.kpi + "，新产品数量：" + manager.getProducts());
    }
}