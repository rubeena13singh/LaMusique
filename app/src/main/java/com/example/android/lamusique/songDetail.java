package com.example.android.lamusique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class songDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);

        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(songDetail.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary);
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicLibraryIntent = new Intent(songDetail.this, musicLibrary.class);
                startActivity(musicLibraryIntent);
            }
        });

        TextView playLists = (TextView) findViewById(R.id.playLists);
        playLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListsIntent = new Intent(songDetail.this, playLists.class);
                startActivity(playListsIntent);
            }
        });
    }

    public void songName(View view) {
        Toast.makeText(this, "Displays song name", Toast.LENGTH_SHORT).show();
    }

    public void artistName(View view) {
        Toast.makeText(this, "Displays artist name", Toast.LENGTH_SHORT).show();
    }

    public void albumName(View view) {
        Toast.makeText(this, "Displays album name", Toast.LENGTH_SHORT).show();
    }
}
