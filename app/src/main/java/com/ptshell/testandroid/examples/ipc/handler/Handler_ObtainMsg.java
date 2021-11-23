package com.ptshell.testandroid.examples.ipc.handler;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * obtain Message
 */
public class Handler_ObtainMsg {
    private final String TAG = "Handler_ObtainMsg";

    public final int MSG_DOWN_FAIL = 1;
    public final int MSG_DOWN_SUCCESS = 2;
    public final int MSG_DOWN_START = 3;
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

    public void readyObtainMsg() {
        new obtainThread().start();
    }

    class obtainThread extends Thread {
        @Override
        public void run() {
            mHandler.obtainMessage(MSG_DOWN_START).sendToTarget();
            try { //让线程睡眠3s。
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mHandler.obtainMessage(MSG_DOWN_SUCCESS).sendToTarget();
        }
    }
}