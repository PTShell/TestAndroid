package com.ptshell.testandroid.presenter;

import android.util.Log;

import com.ptshell.testandroid.base.BasePresenter;
import com.ptshell.testandroid.contract.MainContract;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    @Override
    public void testGetMpresenter() {
        Log.d("PTShell", "我是P层的引用");
        mView.testGetMview();
    }

    @Override
    public void testDb() {
        mDataManager.testDb();
    }

    @Override
    public void testRequestNetwork() {
        mDataManager.testRequestNetwork();
    }

    @Override
    public void testPreference() {
        mDataManager.testPreference();
    }
}