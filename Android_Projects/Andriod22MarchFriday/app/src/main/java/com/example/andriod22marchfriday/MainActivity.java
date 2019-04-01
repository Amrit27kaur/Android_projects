package com.example.andriod22marchfriday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView) findViewById(R.id.img) ;
        img.setImageResource(R.mipmap.dp);

        img.animate().alpha(0.5f).setDuration(2000);

        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    @Override
   protected void onStart(){
        super.onStart();

        Toast.makeText(this, "This is from on start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();

        Toast.makeText(this, "This is from on Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Toast.makeText(this, "This is from on pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Toast.makeText(this, "This is from on Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Toast.makeText(this, "This is from on Destroye", Toast.LENGTH_SHORT).show();
       Log.i("destroy", "this is msg is from on Destroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Toast.makeText(this, "This is from on Restsrt", Toast.LENGTH_SHORT).show();

    }

    public void onLoginClick(View v)
    {
        Intent newLoginIntent = new Intent(this,LoginActivity.class);
        startActivity(newLoginIntent);
    }

    public void onRegistration(View v)
    {
        Intent newRegistration = new Intent(this,Registration.class);
        startActivity(newRegistration);
    }
}
