package com.example.android.lamusique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class playLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_lists);

        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(playLists.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        TextView songDetail = (TextView) findViewById(R.id.songDetail);
        songDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songDetailIntent = new Intent(playLists.this, songDetail.class);
                startActivity(songDetailIntent);
            }
        });


        TextView add = (TextView) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(playLists.this, "Adds a new playlist", Toast.LENGTH_SHORT).show();
            }
        });


        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary);
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicLibraryIntent = new Intent(playLists.this, musicLibrary.class);
                startActivity(musicLibraryIntent);
            }
        });
    }

    public void play1(View view) {
        Toast.makeText(this, "Plays songs in the first playlist", Toast.LENGTH_SHORT).show();
    }

    public void play2(View view) {
        Toast.makeText(this, "Plays songs in the second playlist", Toast.LENGTH_SHORT).show();
    }

    public void play3(View view) {
        Toast.makeText(this, "Plays songs in the third playlist", Toast.LENGTH_SHORT).show();
    }
}
