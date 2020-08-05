package com.alfansyah.multidaya.taskmultidaya;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
            AlertDialog.Builder dialog=new AlertDialog.Builder(this);
            dialog.setMessage("Yes ,Data : "+ getIntent().getStringExtra("data1")+"is passed");
            dialog.setTitle("Dialog Box");
            dialog.setPositiveButton("YES",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Toast.makeText(getApplicationContext(),"ok,great",Toast.LENGTH_LONG).show();
                        }
                    });
            dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(),"close",Toast.LENGTH_LONG).show();
                }
            });
            AlertDialog alertDialog=dialog.create();
            alertDialog.show();
        }else{
            System.out.println("tidak diterima");
        }
    }
}