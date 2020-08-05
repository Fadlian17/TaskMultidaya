package com.alfansyah.multidaya.taskmultidaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final EditText email = (EditText)findViewById(R.id.etEmail);
        final EditText password = (EditText)findViewById(R.id.etPassword);
        final Button button = (Button)findViewById(R.id.btLogin);
        final int counter = 3;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("admin@gmail.com") &&
                        password.getText().toString().equals("admin123")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(ThirdActivity.this,HomeActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                    if (counter == 0) {
                        button.setEnabled(false);
                    }
                }
            }
        });


    }
}