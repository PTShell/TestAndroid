package com.ptshell.testandroid.base;

public interface IBasePresenter<V extends IBaseView> {
    /**
     * 绑定View
     *
     * @param view
     */
    void attachView(V view);
}