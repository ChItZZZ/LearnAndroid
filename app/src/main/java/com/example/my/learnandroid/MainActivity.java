package com.example.my.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private LinearLayout root;

    private Button btnClickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        root =new LinearLayout(this);
        root.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(root);


//        root.addView(btnClickMe,LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

        for(int i =0;i<4;i++){
            btnClickMe = new Button(this);
            btnClickMe.setText("remove me ");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.weight = 1;
            btnClickMe.setOnClickListener(this);
            root.addView(btnClickMe,layoutParams);
        }

    }

    @Override
    public void onClick(View v) {
        root.removeView(v);
    }
}
