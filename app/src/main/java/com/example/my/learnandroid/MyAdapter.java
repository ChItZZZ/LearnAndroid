package com.example.my.learnandroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by my on 2017/7/4.
 */
class MyAdapter extends RecyclerView.Adapter {


    class Holder extends RecyclerView.ViewHolder {


        private View root;
        private TextView title,content;



        public Holder(TextView root) {
            super(root);




            title = (TextView) root.findViewById(R.id.title);
            content = (TextView) root.findViewById(R.id.content);


        }


        public View getRoot() {
            return root;
        }

        public TextView getTitle() {
            return title;
        }

        public TextView getContent() {
            return content;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new Holder((TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Holder vh = (Holder) holder;
        vh.getTitle().setText("item" + position);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    private String[] data = new String[]{"Hello", "world"};
}
