package com.example.shopping.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.shopping.Beans.PriceBean;
import com.example.shopping.R;

import java.util.ArrayList;
import java.util.List;

public class ShopFragmentAdapter extends RecyclerView.Adapter<ShopFragmentAdapter.ViewHolder> {
    Context context;
    CheckBox cb;
    public ShopFragmentAdapter(Context context,CheckBox cb) {
        this.context = context;
        this.cb=cb;
    }
    List<PriceBean.DataBean.ItemsBean>itemsBeans=new ArrayList<>();
    public void initData( List<PriceBean.DataBean.ItemsBean>itemsBeans){
        this.itemsBeans=itemsBeans;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(View.inflate(context, R.layout.item_shop,null));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        PriceBean.DataBean.ItemsBean itemsBean = itemsBeans.get(i);
        Glide.with(context).load(itemsBean.getImg3()).into(viewHolder.item_image);
        viewHolder.item_title.setText(itemsBean.getName());
       // viewHolder.item_cb.setChecked();
    }

    @Override
    public int getItemCount() {
        return itemsBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox item_cb;
        ImageView item_image;
        TextView item_title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_cb=itemView.findViewById(R.id.item_cb);
            item_image=itemView.findViewById(R.id.item_image);
            item_title=itemView.findViewById(R.id.item_title);
        }
    }
}
