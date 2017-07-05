package com.example.my.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView textView;


    private LinearLayout root;

    private Button btnClickMe;


    private Spinner spinner;

    private String[] dataSource = new String[]{"adasd","123123"};
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        recyclerView = new RecyclerView(this);


//        setContentView(recyclerView);
        textView = new TextView(this);

        //context
        textView.setText(R.string.app_name);

        setContentView(textView);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter());

//        root =new LinearLayout(this);
//        root.setOrientation(LinearLayout.HORIZONTAL);
//        setContentView(root);
//
//
////        root.addView(btnClickMe,LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
//
//        for(int i =0;i<4;i++){
//            btnClickMe = new Button(this);
//            btnClickMe.setText("remove me ");
//            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
//            layoutParams.weight = 1;
//            btnClickMe.setOnClickListener(this);
//            root.addView(btnClickMe,layoutParams);
//        }


        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter((new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new String[]{"asda","asda"})));

    }

    @Override
    public void onClick(View v) {
        root.removeView(v);
    }

}
