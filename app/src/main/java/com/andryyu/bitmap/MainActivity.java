package com.andryyu.bitmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnQuality, btnSize, btnLibjpeg;
    private ImageView ivQuality, ivSize, ivLibjpeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        ivQuality = (ImageView) findViewById(R.id.iv_quality);
        ivSize = (ImageView) findViewById(R.id.iv_size);
        ivLibjpeg = (ImageView) findViewById(R.id.iv_libjpeg);

        btnQuality = (Button) findViewById(R.id.btn_quality);
        btnSize = (Button) findViewById(R.id.btn_size);
        btnLibjpeg = (Button) findViewById(R.id.btn_libjpeg);
        btnQuality.setOnClickListener(this);
        btnSize.setOnClickListener(this);
        btnLibjpeg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      switch (view.getId()){
          case R.id.btn_quality:

              break;
          case R.id.btn_size:

              break;
          case R.id.btn_libjpeg:

              break;
      }
    }
}
