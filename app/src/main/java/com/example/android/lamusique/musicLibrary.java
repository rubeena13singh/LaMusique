package com.example.android.lamusique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class musicLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(musicLibrary.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        TextView songDetail = (TextView) findViewById(R.id.songDetail);
        songDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songDetailIntent = new Intent(musicLibrary.this, songDetail.class);
                startActivity(songDetailIntent);
            }
        });

        TextView playLists = (TextView) findViewById(R.id.playLists);
        playLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListsIntent = new Intent(musicLibrary.this, playLists.class);
                startActivity(playListsIntent);
            }
        });

        TextView showAllSongs = (TextView) findViewById(R.id.showAllSongs);
        showAllSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(musicLibrary.this, "Displays the list of all your songs", Toast.LENGTH_SHORT).show();
            }
        });
    }
}