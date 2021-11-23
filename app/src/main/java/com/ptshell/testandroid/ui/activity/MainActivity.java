package com.ptshell.testandroid.ui.activity;

import android.util.Log;

import com.ptshell.testandroid.R;
import com.ptshell.testandroid.base.BaseActivity;
import com.ptshell.testandroid.contract.MainContract;
import com.ptshell.testandroid.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @Override
    protected void initPresenter() {
        mPresenter = new MainPresenter();
    }

    @Override
    protected void initView() {
        mPresenter.testGetMpresenter();
        mPresenter.testDb();
        mPresenter.testRequestNetwork();
        mPresenter.testPreference();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void testGetMview() {
        Log.d("PTShell", "我是V层的引用");
    }
}