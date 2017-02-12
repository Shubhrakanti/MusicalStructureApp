package com.example.giddu.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout nowPlaying;
    LinearLayout songs;
    LinearLayout artists;
    LinearLayout radio;
    LinearLayout playlists;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nowPlaying = (LinearLayout) findViewById(R.id.nowPlayingBar);
        songs = (LinearLayout) findViewById(R.id.songsBar);
        playlists= (LinearLayout) findViewById(R.id.playlistsBar);
        radio = (LinearLayout) findViewById(R.id.radioBar);
        artists = (LinearLayout) findViewById(R.id.artistsBar);
    }

    public void nowPlayingClick (View v){
        Intent i = new Intent(this, NowPlayingActivity.class);
        startActivity(i);
    }

    public void songClick (View v){
        Intent i = new Intent(this, SongsActivity.class);
        startActivity(i);
    }

    public void radioClick (View v){
        Intent i = new Intent(this, RadioActivity.class);
        startActivity(i);
    }

    public void playlistsClick (View v){
        Intent i = new Intent(this, PlaylistsActivity.class);
        startActivity(i);
    }

    public void artistsClick (View v){
        Intent i = new Intent(this, ArtistsActivity.class);
        startActivity(i);
    }


}
