package com.example.baseadapterlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
     ArrayList<String> array = new ArrayList<String>(Arrays.asList("John"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        update();
    }

  public void onClickAdd(View v)
  {
      EditText et = (EditText) findViewById(R.id.name);
      array.add(et.getText().toString());

      update();
  }

  public void update()
  {
      ListView lv = (ListView) findViewById(R.id.list);

      ArrayAdapter<String> userData = new ArrayAdapter<String>(this,R.layout.activity_list_item,R.id.userName,array);

      lv.setAdapter(userData);

      lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              //   Toast.makeText(MainActivity.this, list.get(position),Toast.LENGTH_SHORT).show();
              //list.remove(position);
              update();
              Intent profile = new Intent(MainActivity.this,ProfileActivity.class);
              profile.putExtra("userName",array.get(position));
              startActivity(profile);
          }
      });

  }
}
