package com.ptshell.testandroid.examples.designmode.visitor_mode.ex2;

import android.util.Log;

public class Client {

    private static final String TAG = Client.class.getName();

    protected void test() {
        //构建报表
        BusinessReport report = new BusinessReport();
        Log.v(TAG, "--------CEO visit--------------");
        //设置访问者，这里是CEO
        report.showReport(new CEOVisitor());
        Log.v(TAG, "--------CTO visit-------------");
        //注入另一个访问者, CTO
        report.showReport(new CTOVisitor());
    }
}
