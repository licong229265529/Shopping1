package com.example.shopping.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopping.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoundFragment extends Fragment {


    private View view;
    private Toolbar mFoundToolbar;
    private RecyclerView mFoundRec;

    public FoundFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_found, null);

        initView(view);
        return view;
    }

    private void initView(View view) {
        mFoundToolbar = (Toolbar) view.findViewById(R.id.found_toolbar);
        mFoundRec = (RecyclerView) view.findViewById(R.id.Found_rec);

    }
}
