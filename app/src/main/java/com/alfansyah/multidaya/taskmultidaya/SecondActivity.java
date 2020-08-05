package com.alfansyah.multidaya.taskmultidaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn2 = (Button) findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(SecondActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });

        TextView tvdetail2 = (TextView)findViewById(R.id.TV2);
        if(getIntent().getExtras()!=null){
            tvdetail2.setText(getIntent().getStringExtra("data1"));
        }else{
            System.out.println("tidak diterima");
        }
    }
}