package com.ptshell.testandroid.model;

import com.ptshell.testandroid.model.db.AppDbHelper;
import com.ptshell.testandroid.model.http.AppApiHelper;
import com.ptshell.testandroid.model.preference.AppPreferenceHelper;

public class DataManager implements AppDbHelper, AppApiHelper, AppPreferenceHelper {
    private AppDbHelper mAppDbHelper;
    private AppApiHelper mAppApiHelper;
    private AppPreferenceHelper mAppPreferenceHelper;

    public DataManager(AppDbHelper mAppDbHelper, AppApiHelper appApiHelper, AppPreferenceHelper appPreferenceHelper) {
        this.mAppDbHelper = mAppDbHelper;
        this.mAppApiHelper = appApiHelper;
        this.mAppPreferenceHelper = appPreferenceHelper;
    }


    @Override
    public void testDb() {
        mAppDbHelper.testDb();
    }

    @Override
    public void testRequestNetwork() {
        mAppApiHelper.testRequestNetwork();
    }

    @Override
    public void testPreference() {
        mAppPreferenceHelper.testPreference();
    }
}