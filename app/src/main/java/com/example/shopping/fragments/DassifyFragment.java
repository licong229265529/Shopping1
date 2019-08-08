package com.example.shopping.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopping.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DassifyFragment extends Fragment {


    private View view;
    private Toolbar mMyToolbar;
    private RecyclerView mMyRec;

    public DassifyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_dassify, null);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        mMyToolbar = (Toolbar) inflate.findViewById(R.id.myToolbar);
        mMyRec = (RecyclerView) inflate.findViewById(R.id.myRec);
        mMyRec.setLayoutManager(new LinearLayoutManager(getActivity()));

    }
}
