package com.example.fragmentapril3;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1(View v)
    {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.fragmentLayout , new listFargment());

        ft.commit();
    }


    public void btn2(View v)
    {
   FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();

   ft1.replace(R.id.fragmentLayout , new addFragment());

   ft1.commit();
    }
}
