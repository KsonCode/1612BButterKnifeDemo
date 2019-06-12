package com.bwie.butterknifedemo.ui.fragment.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwie.butterknifedemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment{
    private View rootView;

    @BindView(R.id.tv_name)
    TextView nameTv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.product_item_layout,container,false);

        ButterKnife.bind(this,rootView);

        initView();

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {

    }

    private void initView() {
        nameTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
