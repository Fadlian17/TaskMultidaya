package com.alfansyah.multidaya.taskmultidaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvdetail = (TextView)findViewById(R.id.detail1);
        if(getIntent().getExtras()!=null){
        tvdetail.setText(getIntent().getStringExtra("data1"));
        }else{
            System.out.println("tidak diterima");
        }
    }
}