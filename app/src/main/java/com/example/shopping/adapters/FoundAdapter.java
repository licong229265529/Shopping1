package com.example.shopping.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shopping.Beans.FoundBeans;
import com.example.shopping.R;

import java.util.ArrayList;

public class FoundAdapter extends RecyclerView.Adapter<FoundAdapter.ViewHolder> {
    Context context;
    ArrayList<FoundBeans> list = new ArrayList<>();

    public FoundAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context, R.layout.found_item_layout, null);
        View view1 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.found_item_layout, viewGroup, false);
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.myfounnd_tv1.setText(list.get(i).getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void initData(ArrayList<FoundBeans> list) {
        if (this.list!=null){
            this.list.clear();
            this.list.addAll(list);
            notifyDataSetChanged();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView myfounnd_tv1;
        private ImageView found_img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myfounnd_tv1 = itemView.findViewById(R.id.myfounnd_tv1);
            found_img = itemView.findViewById(R.id.found_img);
        }
    }
}
