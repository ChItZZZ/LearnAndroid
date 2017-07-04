package com.example.my.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RelativeLayoutAty extends AppCompatActivity {


    private RelativeLayout root;

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_relative_layout_aty);

        root = new RelativeLayout(this);

        setContentView(root);
        textView = new TextView(this);
        textView.setText("jike");

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.leftMargin = 200;
        layoutParams.topMargin = 500;
        root.addView(textView,layoutParams);

    }
}
