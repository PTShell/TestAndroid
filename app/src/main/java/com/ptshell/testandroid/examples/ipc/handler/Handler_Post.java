package com.ptshell.testandroid.examples.ipc.handler;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * Post Message
 */
public class Handler_Post {
    public final int MSG_DOWN_FAIL = 1;
    public final int MSG_DOWN_SUCCESS = 2;
    public final int MSG_DOWN_START = 3;
    private final String TAG = "Handler_SendMsg";
    private final Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_DOWN_FAIL:
                    Log.d(TAG, "download fial");
                    break;
                case MSG_DOWN_SUCCESS:
                    Log.d(TAG, "download success");
                    break;
                case MSG_DOWN_START:
                    Log.d(TAG, "download start");
                    break;
            }
        }
    };

    public void readyPost() {
        new postThread().start();
    }

    class postThread extends Thread {
        @Override
        public void run() {
            Log.d(TAG, "run threadid = " + Thread.currentThread().getId() +
                    ",name=" + Thread.currentThread().getName());
            try { //让线程睡眠3s
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    Log.d(TAG, "Runnable threadid=" + Thread.currentThread().getId()
                            + ",name=" + Thread.currentThread().getName());
                }
            });
        }
    }
}