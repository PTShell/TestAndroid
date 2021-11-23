package com.ptshell.testandroid.examples.ipc.asynctask;

import android.os.AsyncTask;
import android.os.SystemClock;

public class MyAsyncTask extends AsyncTask {
    @Override
    protected Object doInBackground(Object[] objects) {
        for (int i = 0; i < 3; i++) {
            SystemClock.sleep(1000);

        }
        return objects[0].toString();
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);

    }
}