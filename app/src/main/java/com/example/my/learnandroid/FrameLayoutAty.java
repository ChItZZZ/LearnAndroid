package com.example.my.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class FrameLayoutAty extends AppCompatActivity {


    private FrameLayout root;

    private ImageView imgA,imgB;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_aty);


        root = (FrameLayout) findViewById(R.id.root);

        imgA = (ImageView) findViewById(R.id.img1);
        imgB = (ImageView) findViewById(R.id.img2);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imgA.getVisibility() == View.VISIBLE){
                    showB();
                }else{
                    showA();
                }
            }
        });

    }

    private void showA(){
        imgA.setVisibility(View.VISIBLE);
        imgB.setVisibility(View.INVISIBLE);
    }

    private void showB(){
        imgA.setVisibility(View.INVISIBLE);
        imgB.setVisibility(View.VISIBLE);
    }
}
