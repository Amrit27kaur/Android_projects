package com.example.baseadapterlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        TextView tv = (TextView)findViewById(R.id.txt);

        String name = getIntent().getStringExtra("userName");

        tv.setText(name);
    }
}
