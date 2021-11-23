package com.ptshell.testandroid.examples.ipc.asynctask;

public class AsyncTaskTest {
    private void four() {
        new MyAsyncTask().execute("通过AsyncTask方法");
    }
}
