package com.example.thrusday28listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("AlexGHgs","john","smith","Alex"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       onCall();
    }

    public void onClick(View v)
    {
        EditText et = (EditText)findViewById(R.id.txtName);
        list.add(et.getText().toString());

       onCall();

        Toast.makeText(this, "Successfully", Toast.LENGTH_SHORT).show();

    }
    public void onCall()
    {
        ListView lv = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> userData = new ArrayAdapter<String>(this,R.layout.activity_list_item,R.id.userName,list);



        lv.setAdapter(userData);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             //   Toast.makeText(MainActivity.this, list.get(position),Toast.LENGTH_SHORT).show();
                //list.remove(position);
                onCall();
                Intent profile = new Intent(MainActivity.this,proflieActivity.class);
               profile.putExtra("userName",list.get(position));
                 startActivity(profile);
            }
        });
    }
}
