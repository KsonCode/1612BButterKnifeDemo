package com.bwie.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bwie.butterknifedemo.adapter.ProductsAdapter;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends BaseActivity implements XRecyclerView.LoadingListener {


    XRecyclerView xRecyclerView;
    @BindView(R.id.tv_title)
    TextView titleTv;
//    private Unbinder bind;
    private int page = 1;
    private ProductsAdapter productsAdapter;


    @Override
    protected void initData() {

        setData();
    }

    @Override
    protected int bingLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.btn_send,R.id.btn_send2})
    public void sendBtn(View v){

        Button button = (Button) v;
        button.setText("2");

//        Toast.makeText(this,"我是按钮",Toast.LENGTH_SHORT).show();

        showToast("我是按钮");

    }

    private void setData() {
        titleTv.setText("hihihihi");
        xRecyclerView.setLoadingListener(this);//
        xRecyclerView.setLoadingMoreEnabled(true);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if (bind!=null){
//            bind.unbind();
//            bind = null;
////            System.gc();
//        }



    }

    public void success(){
        if (page==1){//下拉
            productsAdapter = new ProductsAdapter();
            xRecyclerView.setAdapter(productsAdapter);
        }else{
            if (productsAdapter!=null){
                //处理新数据
                productsAdapter.setData();
//                productsAdapter.notifyDataSetChanged();
            }
        }
    }

    /**
     * 刷新
     */
    @Override
    public void onRefresh() {
        page = 1;


    }

    /**
     * 上拉
     */
    @Override
    public void onLoadMore() {
        page++;

    }
}
