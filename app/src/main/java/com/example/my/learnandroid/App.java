package com.example.my.learnandroid;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by my on 2017/7/5.
 */

public class App extends Application {


    public String text = "default";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("App onCreate");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }


    //程序内存清理
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
