package com.ptshell.testandroid.contract;

import com.ptshell.testandroid.base.IBasePresenter;
import com.ptshell.testandroid.base.IBaseView;

public interface MainContract {

    interface View extends IBaseView {
        void testGetMview();
    }

    interface Presenter extends IBasePresenter<View> {
        void testGetMpresenter();

        void testDb();

        void testRequestNetwork();

        void testPreference();
    }
}