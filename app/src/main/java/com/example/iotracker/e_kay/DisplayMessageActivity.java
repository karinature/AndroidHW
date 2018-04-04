package com.example.iotracker.e_kay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        Intent intent = getIntent();
        String name = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE_NAME);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(name);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.contenta);
        relativeLayout.addView(textView);
    }
}