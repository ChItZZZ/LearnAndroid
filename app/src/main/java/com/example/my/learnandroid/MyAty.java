package com.example.my.learnandroid;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

/**
 * Created by my on 2017/7/5.
 */

public class MyAty extends Activity{

    public static final String ACTION = "test";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.myaty);
    }
}
