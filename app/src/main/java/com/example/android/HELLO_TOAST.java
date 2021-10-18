package com.example.android;

;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HELLO_TOAST extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);

        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.extramsg);

        TextView textView = findViewById(R.id.textcount);
        textView.setText(msg);
    }
}