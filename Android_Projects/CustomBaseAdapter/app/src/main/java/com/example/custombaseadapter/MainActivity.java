package com.example.custombaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String names[] = {"John ", "Jane" , "Sam"};
        String description[] = {"some desc ab rtjohn ", "Jfdgdfgdfgane" , "Sa6456456m"};

        UsersAdpt ca = new UsersAdpt(this, names, description);

        ListView lt = (ListView)findViewById(R.id.list);


        lt.setAdapter(ca);
    }

    public void onClickAdd(View v)
    {
        EditText name = (EditText)findViewById(R.id.name);
        EditText des = (EditText)findViewById(R.id.desc);
    }


}
