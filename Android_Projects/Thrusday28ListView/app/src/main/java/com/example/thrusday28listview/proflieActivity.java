package com.example.thrusday28listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class proflieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proflie);

        TextView tv = (TextView)findViewById(R.id.txt);

        String name = getIntent().getStringExtra("userName");

        tv.setText(name);
    }
}
