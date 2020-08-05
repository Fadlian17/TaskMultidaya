package com.alfansyah.multidaya.taskmultidaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final EditText Edata2 = (EditText) findViewById(R.id.data2);
        Button btSubmit = (Button) findViewById(R.id.bt_submit2);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * Passing data via Intent
                 */

                Intent intent = new Intent(ResultActivity.this, SecondActivity.class);
                intent.putExtra("data1", Edata2.getText().toString());
                startActivity(intent);
            }
        });
    }


}