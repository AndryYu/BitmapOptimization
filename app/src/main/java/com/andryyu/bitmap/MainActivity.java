package com.andryyu.bitmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.andryyu.bitmap.cache.PhotoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnCache, btnCompress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        btnCache = (Button) findViewById(R.id.btn_cache);
        btnCompress = (Button) findViewById(R.id.btn_compress);
        btnCache.setOnClickListener(this);
        btnCompress.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      switch (view.getId()){
          case R.id.btn_cache:
                startActivity(new Intent(MainActivity.this, PhotoActivity.class));
              break;
          case R.id.btn_compress:

              break;
      }
    }
}
