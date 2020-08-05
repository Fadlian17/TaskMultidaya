package com.alfansyah.multidaya.taskmultidaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final EditText Edata1 = (EditText) findViewById(R.id.data1);
        Button btSubmit = (Button)findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * Passing data via Intent
                 */

                Intent intent = new Intent(FirstActivity.this, DetailActivity.class);
                intent.putExtra("data1", Edata1.getText().toString());
                startActivity(intent);
            }
        });
    }
}