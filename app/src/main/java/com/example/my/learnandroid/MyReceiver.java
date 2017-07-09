package com.example.my.learnandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    public static final String ACTION = "com.example.my.learnandroid.intent.action.MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        System.out.println("myreceiver接收到了消息"+intent.getStringExtra("data"));

        abortBroadcast();

    }
}
