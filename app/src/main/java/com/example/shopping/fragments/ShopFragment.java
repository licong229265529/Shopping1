package com.example.shopping.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.shopping.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {


    private View view;

    private RecyclerView mShopRecycler;
    private CheckBox mShopCb;

    /**
     * ￥0.00
     */
    private TextView mShopPrice;
    /**
     * 结算
     */
    private Button mShopClearing;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop, null);
        initView(view);

        return view;
    }

    private void initView(View view) {

        mShopRecycler = (RecyclerView) view.findViewById(R.id.shop_recycler);
        mShopCb = (CheckBox) view.findViewById(R.id.shop_cb);
        mShopPrice = (TextView) view.findViewById(R.id.shop_price);
        mShopClearing = (Button) view.findViewById(R.id.shop_Clearing);



    }
}
