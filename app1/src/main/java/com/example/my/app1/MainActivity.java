package com.example.my.app1;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate();
    }

    private void calculate() {

        StringBuilder str = new StringBuilder();
        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        int memClass = am.getMemoryClass();
        int largeMemClass = am.getLargeMemoryClass();


        str.append("memclass"+memClass);
        str.append("large"+largeMemClass);


        Float total = Runtime.getRuntime().totalMemory() * 1.0f /(1024*1024);
        Float free = Runtime.getRuntime().freeMemory() * 1.0f /(1024*1024);
        Float max = Runtime.getRuntime().maxMemory() * 1.0f /(1024*1024);

        str.append("total"+total);
        str.append("free"+free);
        str.append("max"+max);



    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.d(TAG, "onTrimMemory: ");
    }
}
