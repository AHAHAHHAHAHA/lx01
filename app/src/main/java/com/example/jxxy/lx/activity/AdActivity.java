package com.example.jxxy.lx.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jxxy.lx.R;
import com.example.jxxy.lx.common.BaseActivity;
import com.example.jxxy.lx.common.MoblieShopApp;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

public class AdActivity extends BaseActivity{

    private TextView tv_skip;

    @Override
    public int getContentViewId(){
        return R.layout.activity_ad;
    }

    @Override
    protected void initView(){
        super.initView();
        tv_skip = (TextView)findViewById(R.id.tv_skip);
        tv_skip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                skip();
            }
        });
        ImageView imageView = (ImageView)findViewById(R.id.iv_image);
        String url = "https://www.ivsky.com/bizhi/maomi_laoshi_v56954/pic_890087.html";
        ImageLoader.getInstance().displayImage(url,imageView,new ImageLoadingListener(){
            @Override
            public void onLoadingStarted(String imageUri, View view){

            }
            @Override
            public void onLoadingFailed(String imageUri,View view,FailReason failReason){
                MoblieShopApp.handler.post(jumpTread);
            }
            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage){
                MoblieShopApp.handler.post(jumpTread);
            }
            @Override
            public void onLoadingCancelled(String imageUri,View view){
                MoblieShopApp.handler.post(jumpTread);
            }
        });
    }
    private void skip(){
        Intent intent = new Intent(AdActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
        c_count = COUNT;
        MoblieShopApp.handler.removeCallbacks(jumpTread);
    }
    private static final String SKIP_TEXT = "点击跳过%d";
    private final static int COUNT = 5;
    private final static int DELAYED = 1000;
    private int c_count = COUNT;
    private Runnable jumpTread = new  Runnable(){
        @Override
        public void run(){
            if(c_count <= 0){
                skip();
            }else{
                tv_skip.setText(String.format(SKIP_TEXT,c_count));
                c_count--;
                MoblieShopApp.handler.postDelayed(jumpTread,DELAYED);
            }
        }
    };
}
