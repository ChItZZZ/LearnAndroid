package com.example.my.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private LinearLayout root;

    private Button btnClickMe;

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        recyclerView = new RecyclerView(this);


        setContentView(recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new RecyclerView.Adapter() {


            class Holder extends RecyclerView.ViewHolder{
                private TextView textView;


                public Holder(TextView itemView) {
                    super(itemView);

                    textView = itemView;
                }

                public TextView getTextView() {
                    return textView;
                }
            }
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                return new Holder(new TextView(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

                Holder vh = (Holder) holder;
                vh.getTextView().setText("item"+position);

            }

            @Override
            public int getItemCount() {
                return data.length;
            }

            private String[] data = new String[]{"Hello","world"};
        });

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

    }

    @Override
    public void onClick(View v) {
        root.removeView(v);
    }
}
