package com.bwie.butterknifedemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwie.butterknifedemo.R;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ProductsAdapter extends XRecyclerView.Adapter<ProductsAdapter.MyViewHolder> {

    private  Unbinder bind;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = View.inflate()
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_item_layout,viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


    }

    @Override
    public int getItemCount() {

        return 0;
    }

    /**
     * 更多
     */
    public void setData() {
        notifyDataSetChanged();
    }

    public  class MyViewHolder extends XRecyclerView.ViewHolder{

        //        private TextView nameTv;
        @BindView(R.id.tv_name)
        TextView nameTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //绑定方案
            bind = ButterKnife.bind(this, itemView);



        }
    }

    public void unbindButterknife(){
        if (bind!=null){
            bind.unbind();
            bind = null;
        }
    }
}
