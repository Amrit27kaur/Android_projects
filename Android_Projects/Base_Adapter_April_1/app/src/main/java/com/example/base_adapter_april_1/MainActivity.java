package com.example.base_adapter_april_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> name = new ArrayList<String>(Arrays.asList("AlexGHgs","john","smith","Alex"));
    ArrayList<String> mail = new ArrayList<String>(Arrays.asList("Alex@g.c","john@g.c","smith@g.c","Alex@g.c"));
    ArrayList<String> add = new ArrayList<String>(Arrays.asList("Alex12","john23","smith34","Alex45"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCall();
    }

    public void onClick (View v)
    {

    }


    public void onCall()
    {
        ListView lv = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> userData = new ArrayAdapter<String>(this,R.layout.activity_list_item,R.id.userName,name,mail,add);



        lv.setAdapter(userData);

    }

   }
