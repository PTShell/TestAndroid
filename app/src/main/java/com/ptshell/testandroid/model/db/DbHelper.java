package com.ptshell.testandroid.model.db;

import android.util.Log;

public class DbHelper implements AppDbHelper {
    @Override
    public void testDb() {
        Log.d("PTShell", "数据库操作");
    }
}