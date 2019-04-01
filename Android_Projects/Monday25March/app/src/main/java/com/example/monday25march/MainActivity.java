package com.example.monday25march;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playBtn(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.gun);
        mp.start();
    }
}
