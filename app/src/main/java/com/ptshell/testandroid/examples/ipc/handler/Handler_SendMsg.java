package com.ptshell.testandroid.examples.ipc.handler;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * sendMessage
 */
public class Handler_SendMsg {
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

    public void readySendMsg() {
        new MyThread().start();
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            Log.d(TAG, "MyThread start run");
            //发送消息给mHander
            mHandler.sendEmptyMessage(MSG_DOWN_START);
            try { //让线程睡眠3s。
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Message msg = new Message();
            msg.what = MSG_DOWN_SUCCESS;
            //msg.arg1 = 111;  可以设置arg1、arg2、obj等参数，传递这些数据
            //msg.arg2 = 222; msg.obj = obj;
            mHandler.sendMessage(msg);
            Log.d(TAG, "MyThread stop run");
        }
    }

}