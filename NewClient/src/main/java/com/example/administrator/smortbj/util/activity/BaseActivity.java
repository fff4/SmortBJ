package com.example.administrator.smortbj.util.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/3/16.
 */

/**
 * 抽取所有activity的公共方法
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutID());
        ButterKnife.bind(this);
        
        init();
    }

    /**
     * 初始化方法，可以编写公共的方法
     */
    protected void init(){

    }

    /**
     * 获得布局的资源id， 返回值是id值
     * @return
     */
    public abstract int getLayoutID();
}
