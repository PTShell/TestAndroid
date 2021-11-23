package com.ptshell.testandroid.base;

import com.ptshell.testandroid.model.DataManager;
import com.ptshell.testandroid.model.db.AppDbHelper;
import com.ptshell.testandroid.model.db.DbHelper;
import com.ptshell.testandroid.model.http.ApiHelper;
import com.ptshell.testandroid.model.http.AppApiHelper;
import com.ptshell.testandroid.model.preference.AppPreferenceHelper;
import com.ptshell.testandroid.model.preference.PreferenceHelper;

public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    //数据管理,负责M层的业务逻辑操作
    protected DataManager mDataManager;
    //V层的引用
    protected V mView;

    /**
     * 初始化DataManager
     */
    public BasePresenter() {
        //数据库
        AppDbHelper appDbHelper = new DbHelper();
        //共享参数存储
        AppPreferenceHelper appPreferenceHelper = new PreferenceHelper();
        //网络请求
        AppApiHelper appApiHelper = new ApiHelper();
        mDataManager = new DataManager(appDbHelper, appApiHelper, appPreferenceHelper);
    }

    /**
     * 绑定view
     *
     * @param view
     */
    @Override
    public void attachView(V view) {
        this.mView = view;
    }
}