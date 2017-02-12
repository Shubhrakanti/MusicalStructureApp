package com.example.giddu.musicalstructureapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NowPlayingActivity extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        back = (ImageView) findViewById(R.id.backIcon);
    }

    public void goBack(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
